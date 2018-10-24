import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;


public class EdgeConvertFileParserTest {
   private File inFile = new File("Courses.edg");
   private EdgeConvertFileParser ecfp = new EdgeConvertFileParser(inFile);
   private EdgeTable[] tables;
   private EdgeField[] fields;
   private EdgeTable testTable;
   private EdgeField testField;

   @Test 
   public void testGetEdgeTables() {
      tables = ecfp.getEdgeTables();
      testTable = tables[0];
      String tableName = testTable.getName();
      assertEquals("STUDENT",tableName);
   }
   
   @Test
   public void testGetEdgeFields(){
      fields = ecfp.getEdgeFields();
      testField = fields[0];
      String fieldName = testField.getName();
      assertEquals("Grade",fieldName);
   }
}
