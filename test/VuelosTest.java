
import Clases.Vuelo;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabri
 */
public class VuelosTest {
    
    public VuelosTest() {
    }
@Test
public void classIsNullTest(){
     Vuelo Vuelos1=null;
     Assert.assertNull(Vuelos1);
     Vuelos1=new Vuelo();
     Assert.assertNotNull(Vuelos1);
}}

