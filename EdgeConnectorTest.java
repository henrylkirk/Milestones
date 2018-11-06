import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;

@RunWith(Parameterized.class)
public class EdgeConnectorTest {

    private EdgeConnector ec;
    private StringBuilder sb = new StringBuilder();

    private int testNum;
    private int testPoint1;
    private int testPoint2;
    private String testStyle1;
    private String testStyle2;
    private boolean testEP1F;
    private boolean testEP2F;
    private boolean testEP1T;
    private boolean testEP2T;

    private static Object[][] testObjects;

    public EdgeConnectorTest(int testNum, int testPoint1, int testPoint2, String testStyle1, String testStyle2){
      super();
      this.testNum = testNum;
      this.testPoint1 = testPoint1;
      this.testPoint2 = testPoint2;
      this.testStyle1 = testStyle1;
      this.testStyle2 = testStyle2;
      String inputString = testNum + EdgeConnector.DELIM + testPoint1 + EdgeConnector.DELIM + testPoint2 + EdgeConnector.DELIM + testStyle1 + EdgeConnector.DELIM + testStyle2;
      System.out.println(inputString);
      ec = new EdgeConnector(inputString);
    }

    // Accepts test objects
    public static void prepare(Object[][] testObjects) {
        EdgeConnectorTest.testObjects = testObjects;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(EdgeConnectorTest.testObjects);
    }

    @Test
    public void testGetNumConnector(){
      int numConnect = ec.getNumConnector();
      assertEquals(testNum,numConnect);
    }

    @Test
    public void testGetEndPoint1(){
      int point1 = ec.getEndPoint1();
      assertEquals(testPoint1,point1);
    }

    @Test
    public void testGetEndPoint2(){
      int point2 = ec.getEndPoint2();
      assertEquals(testPoint2,point2);
    }

    @Test
    public void testGetEndStyle1(){
      String style1 = ec.getEndStyle1();
      assertEquals(testStyle1,style1);
    }

    @Test
    public void testGetEndStyle2(){
      String style2 = ec.getEndStyle2();
      assertEquals(testStyle2,style2);
    }

    @Test
    public void testIsEP1Field(){
      ec.setIsEP1Field(true);
      boolean ep1Field = ec.getIsEP1Field();
      assertEquals(true,ep1Field);
    }

    @Test
    public void testIsEP2Field(){
      ec.setIsEP2Field(true);
      boolean ep2Field = ec.getIsEP2Field();
      assertEquals(true,ep2Field);
    }

    @Test
    public void testIsEP1Table(){
      boolean ep1Table = ec.getIsEP1Table();
      assertEquals(true,ep1Table);
    }

    @Test
    public void testIsEP2Table(){
      boolean ep2Table = ec.getIsEP2Table();
      assertEquals(true,ep2Table);
    }
}