import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

public class EdgeFieldTest {

    private EdgeConvertFileParser ecfp;
    private File parseFile;
    private EdgeField[] fields;
    private EdgeField testField;

    @Before
    public void setUp() {
        parseFile = new File("Courses.edg");
        ecfp = new EdgeConvertFileParser(parseFile);
        fields = ecfp.getEdgeFields();
        testField = fields[0];
    }

    @Test
    public void testGetNumFigure() {
        int numFigure = testField.getNumFigure();
        assertEquals(numFigure,3);
    }

    @Test
    public void testGetName() {
        String name = testField.getName();
        assertEquals(name,"Grade");
    }

    @Test
    public void testTableID() {
        testField.setTableID(1234);
        int id = testField.getTableID();
        assertEquals(id,1234);
    }

    @Test
    public void testIsPrimaryKeyTrue() {
        testField.setIsPrimaryKey(true);
        boolean isPKey = testField.getIsPrimaryKey();
        assertEquals(isPKey,true);
    }

    @Test
    public void testIsPrimaryKeyFalse() {
        testField.setIsPrimaryKey(false);
        boolean isPKey = testField.getIsPrimaryKey();
        assertEquals(isPKey,false);
    }

    @Test
    public void testDefaultValue() {
        testField.setDefaultValue("testDefaultValue");
        String value = testField.getDefaultValue();
        assertEquals(value,"testDefaultValue");
    }

    @Test
    public void testVarcharValue() {
        testField.setVarcharValue(1234);
        int value = testField.getVarcharValue();
        assertEquals(value,1234);
    }

    @Test
    public void testDataType() {
        testField.setDataType(1);
        int type = testField.getDataType();
        assertEquals(type,1);
    }
}