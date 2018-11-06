import java.io.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.*;

public class MainTester {

    private String inputString;

    MainTester(String inputString) {
        this.inputString = inputString;
    }

    private static void displayOptions() {
        System.out.println("Available options:");
        System.out.println("-h displays available options");
        System.out.println("-n what follows is a test object");
        System.out.println("-f what follows is the name of a test object file");
    }

    private void handleTestObject() {

        // Break up inputString
        StringTokenizer st = new StringTokenizer(inputString, EdgeConnector.DELIM);
        int testNum = Integer.parseInt(st.nextToken());
        int testPoint1 = Integer.parseInt(st.nextToken());
        int testPoint2 = Integer.parseInt(st.nextToken());
        String testStyle1 = st.nextToken();
        String testStyle2 = st.nextToken();

        // Pass object to test class
        EdgeConnectorTest.prepare(new Object[][]{{testNum,testPoint1,testPoint2,testStyle1,testStyle2}});
        Result result = JUnitCore.runClasses(EdgeConnectorTest.class);
        for (Failure failure : result.getFailures()) {
          System.out.println(failure.toString());
        }
    }

    // Combines two 2D arrays
    private static Object[][] appendArrays(Object[][] array1, Object[][] array2) {
        Object[][] ret = new Object[array1.length + array2.length][];
        int i = 0;
        for (;i<array1.length;i++) {
            ret[i] = array1[i];
        }
        for (int j = 0;j<array2.length;j++) {
            ret[i++] = array2[j];
        }
        return ret;
    }

    private void handleTestFile() throws IOException {
        FileReader fr = new FileReader(inputString);
        BufferedReader br = new BufferedReader(fr);

        String line;
        Object[][] testObjects = new Object[][]{{}};
        while((line = br.readLine()) != null) {
            String[] values = line.split(",");
            int testNum = Integer.parseInt(values[0]);
            int testPoint1 = Integer.parseInt(values[1]);
            int testPoint2 = Integer.parseInt(values[2]);
            String testStyle1 = values[3];
            String testStyle2 = values[4];
            testObjects = appendArrays(testObjects,new Object[][]{{testNum,testPoint1,testPoint2,testStyle1,testStyle2}});
        }

        // Pass objects to test class
        EdgeConnectorTest.prepare(testObjects);
        Result result = JUnitCore.runClasses(EdgeConnectorTest.class);
        for (Failure failure : result.getFailures()) {
          System.out.println(failure.toString());
        }

        br.close();
    }

    public static void main(String[] args) {
        if(args.length == 2) {
            String option = args[0];
            MainTester tester = new MainTester(args[1]);
            switch(option) {
                case "-n":
                    tester.handleTestObject();
                    break;
                case "-f":
                    try {
                        tester.handleTestFile();
                    } catch(IOException e) {
                        System.out.println(e);
                    }
                    break;
                case "-h":
                    MainTester.displayOptions();
                    break;
                default:
                    break;
            }
        } else {
            MainTester.displayOptions();
        }
    }
}