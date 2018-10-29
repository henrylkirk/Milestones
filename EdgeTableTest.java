import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

public class EdgeTableTest {

    private EdgeConvertFileParser ecfp;
    private File parseFile;
    private EdgeTable testTable;

    private static final String DELIM = "|";
    private static final int NUM = 99;
    private static final String NAME = "TEST";

    @Before
    public void setUp() {
        testTable = new EdgeTable(NUM+DELIM+NAME);
        testTable.makeArrays();
    }

    @Test
    public void testGetNumFigure() {
        int num = testTable.getNumFigure();
        assertEquals(num,99);
    }

    @Test
    public void testGetName() {
        String name = testTable.getName();
        assertEquals(name,"TEST");
    }

    @Test
    public void testGetRelatedTablesArray() {
        testTable.addRelatedTable(991);
        testTable.makeArrays();
        int[] relatedTables = testTable.getRelatedTablesArray();
        int relatedTable = relatedTables[0];
        assertEquals(relatedTable,991);
    }

    @Test
    public void testRelatedFields() {
        File parseFile = new File("Courses.edg");
        EdgeConvertFileParser ecfp = new EdgeConvertFileParser(parseFile);
        testTable = ecfp.getEdgeTables()[0];
        testTable.makeArrays();
        testTable.setRelatedField(0,992);
        int[] relatedFields = testTable.getRelatedFieldsArray();
        int fieldNum = relatedFields[0];
        assertEquals(fieldNum,992);
    }

    @Test
    public void testNativeFields() {
        int[] nativeFields = testTable.getNativeFieldsArray();
        int initLength = nativeFields.length;
        testTable.addNativeField(99);
        testTable.makeArrays();
        nativeFields = testTable.getNativeFieldsArray();
        int finalLength = nativeFields.length;
        assertEquals(initLength+1,finalLength);
    }

}