import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EdgeConnectorTest {
    private String numConnector = "1";
    private String endPoint1 = "2";
    private String endPoint2 = "3";
    private String endStyle1 = "Test1";
    private String endStyle2 = "Test2";
    
    private EdgeConnector ec = new EdgeConnector(numConnector + "|" + endPoint1 + "|"+ endPoint2 + "|" + endStyle1 + "|" + endStyle2);
    
    @Test
    public void testGetNumConnector(){
      int numConnect = ec.getNumConnector();
      assertEquals(1,numConnect);
    }
    
    @Test
    public void testGetEndPoint1(){
      int point1 = ec.getEndPoint1();
      assertEquals(2,point1);
    }
    
    @Test
    public void testGetEndPoint2(){
      int point2 = ec.getEndPoint2();
      assertEquals(3,point2);
    }
    
    @Test
    public void testGetEndStyle1(){
      String style1 = ec.getEndStyle1();
      assertEquals("Test1",style1);
    }
    
    @Test
    public void testGetEndStyle2(){
      String style2 = ec.getEndStyle2();
      assertEquals("Test2",style2);
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
      ec.setIsEP1Table(true);
      boolean ep1Table = ec.getIsEP1Table();
      assertEquals(true,ep1Table);
    }
    
    @Test
    public void testIsEP2Table(){
      ec.setIsEP2Table(true);
      boolean ep2Table = ec.getIsEP2Table();
      assertEquals(true,ep2Table);
    }
}