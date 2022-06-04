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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Persona.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Persona instance = new Persona();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setEdad method, of class Persona.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int Edad = 0;
        Persona instance = new Persona();
        instance.setEdad(Edad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Persona.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String Direccion = "";
        Persona instance = new Persona();
        instance.setDireccion(Direccion);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setDui method, of class Persona.
     */
    @Test
    public void testSetDui() {
        System.out.println("setDui");
        String Dui = "";
        Persona instance = new Persona();
        instance.setDui(Dui);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Persona.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        Persona instance = new Persona();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Persona.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Persona instance = new Persona();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setContra method, of class Persona.
     */
    @Test
    public void testSetContra() {
        System.out.println("setContra");
        String Contra = "";
        Persona instance = new Persona();
        instance.setContra(Contra);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getnombre method, of class Persona.
     */
    @Test
    public void testGetnombre() {
        System.out.println("getnombre");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getnombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getdui method, of class Persona.
     */
    @Test
    public void testGetdui() {
        System.out.println("getdui");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getdui();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getapellidos method, of class Persona.
     */
    @Test
    public void testGetapellidos() {
        System.out.println("getapellidos");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getapellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Persona.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //p  fail("The test case is a prototype.");
    }

    /**
     * Test of getcorreo method, of class Persona.
     */
    @Test
    public void testGetcorreo() {
        System.out.println("getcorreo");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getcorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getusuario method, of class Persona.
     */
    @Test
    public void testGetusuario() {
        System.out.println("getusuario");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getusuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getedad method, of class Persona.
     */
    @Test
    public void testGetedad() {
        System.out.println("getedad");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getedad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getcontra method, of class Persona.
     */
    @Test
    public void testGetcontra() {
        System.out.println("getcontra");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getcontra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDatos method, of class Persona.
     */
   
    
}
