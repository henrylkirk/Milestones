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

}