import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EdgeConnectorTest {
    int numConnector = 1
    
    EdgeConnector ec = new EdgeConnector(numConnector + DELIM + endPoint1 + DELIM + endPoint2 + DELIM + endStyle1 + DELIM + endStyle2);
    
    //@Test
    //public void testGetNumConnector()
    //public void testGetEndPoint1
    //public void testGetEndPoint2
    //public void testGetEndStyle1
    //public void testGetEndStyle2
   
    @Test
    public void testIsEP1Field(){
      ec.setIsEP1Field(true);
      boolean ep1Field = ec.getIsEP1Field();
      assertEquals(true,ep1Field);
    }
    
    @Test
    public void testIsEP2Field(){
      ec.setIsEP2Field(true);
      boolean ep2Field - ec.getIsEP2Field();
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