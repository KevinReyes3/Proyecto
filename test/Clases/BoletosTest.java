/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KevinR
 */
public class BoletosTest {
    
    public BoletosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Boletos.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Boletos instance = new Boletos();
        String expResult = null;
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Boletos.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Boletos instance = new Boletos();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodBoleto method, of class Boletos.
     */
    @Test
    public void testGetCodBoleto() {
        System.out.println("getCodBoleto");
        Boletos instance = new Boletos();
        String expResult = null;
        String result = instance.getCodBoleto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCodBoleto method, of class Boletos.
     */
    @Test
    public void testSetCodBoleto() {
        System.out.println("setCodBoleto");
        String CodBoleto = "";
        Boletos instance = new Boletos();
        instance.setCodBoleto(CodBoleto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodAvion method, of class Boletos.
     */
    @Test
    public void testGetCodAvion() {
        System.out.println("getCodAvion");
        Boletos instance = new Boletos();
        String expResult = null;
        String result = instance.getCodAvion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCodAvion method, of class Boletos.
     */
    @Test
    public void testSetCodAvion() {
        System.out.println("setCodAvion");
        String CodAvion = "";
        Boletos instance = new Boletos();
        instance.setCodAvion(CodAvion);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getAsiento method, of class Boletos.
     */
    @Test
    public void testGetAsiento() {
        System.out.println("getAsiento");
        Boletos instance = new Boletos();
        int expResult = 0;
        int result = instance.getAsiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAsiento method, of class Boletos.
     */
    @Test
    public void testSetAsiento() {
        System.out.println("setAsiento");
        int Asiento = 0;
        Boletos instance = new Boletos();
        instance.setAsiento(Asiento);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDestino method, of class Boletos.
     */
    @Test
    public void testGetDestino() {
        System.out.println("getDestino");
        Boletos instance = new Boletos();
        String expResult = null;
        String result = instance.getDestino();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDestino method, of class Boletos.
     */
    @Test
    public void testSetDestino() {
        System.out.println("setDestino");
        String Destino = "";
        Boletos instance = new Boletos();
        instance.setDestino(Destino);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVueloIda method, of class Boletos.
     */
    @Test
    public void testGetVueloIda() {
        System.out.println("getVueloIda");
        Boletos instance = new Boletos();
        String expResult = null;
        String result = instance.getVueloIda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVueloIda method, of class Boletos.
     */
    @Test
    public void testSetVueloIda() {
        System.out.println("setVueloIda");
        String VueloIda = "";
        Boletos instance = new Boletos();
        instance.setVueloIda(VueloIda);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getVueloVenida method, of class Boletos.
     */
    @Test
    public void testGetVueloVenida() {
        System.out.println("getVueloVenida");
        Boletos instance = new Boletos();
        String expResult = null;
        String result = instance.getVueloVenida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setVueloVenida method, of class Boletos.
     */
    @Test
    public void testSetVueloVenida() {
        System.out.println("setVueloVenida");
        String VueloVenida = "";
        Boletos instance = new Boletos();
        instance.setVueloVenida(VueloVenida);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getClaseViaje method, of class Boletos.
     */
    @Test
    public void testGetClaseViaje() {
        System.out.println("getClaseViaje");
        Boletos instance = new Boletos();
        String expResult = null;
        String result = instance.getClaseViaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClaseViaje method, of class Boletos.
     */
    @Test
    public void testSetClaseViaje() {
        System.out.println("setClaseViaje");
        String ClaseViaje = "";
        Boletos instance = new Boletos();
        instance.setClaseViaje(ClaseViaje);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Boletos.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Boletos instance = new Boletos();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Boletos.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Boletos instance = new Boletos();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getnombre method, of class Boletos.
     */
    @Test
    public void testGetnombre() {
        System.out.println("getnombre");
        Boletos instance = new Boletos();
        String expResult = null;
        String result = instance.getnombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDatos method, of class Boletos.
     */
 
    
}
