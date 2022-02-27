
package Clases;
import java.util.Scanner;
public class Catalogo {
     //Atributos 
    String Vuelos ;
    String Promociones;
    String DestinosAn;
    int destino;
    
//constructor
    public Catalogo(){
        Vuelos=" \n 1-España \n 2-Nicaragua \n 3-Elsalvador";
        Promociones="";
        DestinosAn="";
        int destino;
    }
    public  Catalogo(String _vuelos){
        this.Vuelos=_vuelos;
    }

    Catalogo(String Viaje, String Promociones, String DestinoAn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Metodos
     public String getVuelos(){
         return this.Vuelos;
    }
     
    public void setVuelos(String _vuelos){
        this.Vuelos=_vuelos;
    }
    
    
    public String getPromociones(){
     return this.Promociones;
    }
    public void setPromociones(String _promociones){
        this.Promociones=_promociones;
    }
    public String getDestinos(){
    return this.DestinosAn;
    }
    public void setDestinos(String _promociones){
        this.DestinosAn=_promociones;
    }
    
   //Metodo para elegir entre las categorias
    public void VuelosM()
    {
         
        
        //esto es para almacenar el numero que se pidio
        Scanner number =new Scanner(System.in);
        //variable para poder almacenar el dato elegido
        int num;
        System.out.println("Bienvenido, este es nuestro catalogo:");
        System.out.println("1-Vuelos");
        System.out.println("2-Promociones");
        System.out.println("3-Destino Anteriores");
 
        num=number.nextInt();
        //Esto es para comprobar la opcion de categoria que se a elegido y mostrarlo
        //Esta es para la categoria Vuelos
        if (num==1) {
            Scanner vuelo=new Scanner(System.in);
            System.out.println("Haz elegido la categoria vuelos");
         
        //constructor 
         Scanner destin=new Scanner(System.in);
      //devuelve lugares para viajar
         System.out.println("Elija hacia adonde le gustaria viajar"+Vuelos);
         
         //escaneo de datos
         destino=destin.nextInt();
         //se esta usando para elegir multiples opciones
         switch(destino){
             case 1: destino=1;
             System.out.println("su destino es España");
             break;
             case 2: destino=2;
             System.out.println("su destino es Nicaragua");
             break;
             case 3: destino=3;
             System.out.println("su destino es El salvador");
             break;
             
         }

        }
        //if para entrar a la categoria promociones
        else if (num==2) {
            Scanner vuelo=new Scanner(System.in);
            System.out.println("Haz elegido la categoria Promociones");
            
             Scanner destin=new Scanner(System.in);

         System.out.println("Elija la promocion que prefiere"+Promociones);
         
         //escaneo de datos
         destino=destin.nextInt();
         //se esta usando para elegir multiples opciones
         switch(destino){
             case 1: destino=1;
             System.out.println("Usted eligio ");
             break;
             case 2: destino=2;
             System.out.println("");
             break;
             case 3: destino=3;
             System.out.println("");
             break;
         }
            
        }
        //If para poder entrar a la categoria Viajes anteriores
        else if (num==3) {
           
             Scanner Viajes=new Scanner(System.in);
            System.out.println("Usted eligio la categoria Mis destinos anteriores");
       
        }
            
    }

    Object getViajes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getDestinoAn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
