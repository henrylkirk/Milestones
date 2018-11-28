import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;

@RunWith(Parameterized.class)
public class FieldTest {

    private Field testField;
    private static Object[][] testObjects;

    private static final String DELIM = "|";

    public FieldTest(int num, String name) {
        super();
        testField = new Field(num + DELIM + name);
    }

    // Accepts test objects
    public static void prepare(Object[][] testObjects) {
        FieldTest.testObjects = testObjects;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(FieldTest.testObjects);
    }

    @Test
    public void testGetNumFigure() {
        int numFigure = testField.getNumFigure();
        assertEquals(numFigure,99);
    }

    @Test
    public void testGetName() {
        String name = testField.getName();
        assertEquals(name,"TESTNAME");
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