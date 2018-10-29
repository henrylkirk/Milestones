import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

public class EdgeTableTest {

    private EdgeConvertFileParser ecfp;
    private File parseFile;
    private EdgeTable[] tables;
    private EdgeTable testTable;

    @Before
    public void setUp() {
        parseFile = new File("Courses.edg");
        ecfp = new EdgeConvertFileParser(parseFile);
        tables = ecfp.getEdgeTables();
        testTable = tables[0];
        testTable.makeArrays();
    }

    @Test
    public void testGetNumFigure() {
        int num = testTable.getNumFigure();
        assertEquals(num,1);
    }

    @Test
    public void testGetName() {
        String name = testTable.getName();
        assertEquals(name,"STUDENT");
    }

    @Test
    public void testGetRelatedTablesArray() {
        testTable.addRelatedTable(99);
        testTable.makeArrays();
        int[] relatedTables = testTable.getRelatedTablesArray();
        int relatedTable = relatedTables[0];
        assertEquals(relatedTable,99);
    }

    @Test
    public void testRelatedFields() {
        testTable.setRelatedField(0,99);
        int[] relatedFields = testTable.getRelatedFieldsArray();
        int fieldNum = relatedFields[0];
        assertEquals(fieldNum,99);
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