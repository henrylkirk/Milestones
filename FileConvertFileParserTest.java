import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;


public class FileConvertFileParserTest {
   private File inFile = new File("Courses.edg");
   private FileConvertFileParser ecfp = new EdgeConvertFileParser(inFile);
   private Table[] tables;
   private Field[] fields;
   private Table testTable;
   private Field testField;

   @Test
   public void testGetTables() {
      tables = ecfp.getTables();
      testTable = tables[0];
      String tableName = testTable.getName();
      assertEquals("STUDENT",tableName);
   }

   @Test
   public void testGetFields(){
      fields = ecfp.getFields();
      testField = fields[0];
      String fieldName = testField.getName();
      assertEquals("Grade",fieldName);
   }
}
