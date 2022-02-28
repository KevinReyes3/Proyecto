
package Clases;

import java.util.Scanner;


public class Catalogo {
    
    private String Viajes;
    private String Promociones;
    private String DestinoAn;

    public Catalogo(String Viajes, String Promociones, String DestinoAn) {
        this.Viajes = Viajes;
        this.Promociones = Promociones;
        this.DestinoAn = DestinoAn;
    }

    Catalogo() {
    }

    
    
    public String getViajes() {
        return Viajes;
    }

    public void setViajes(String Viajes) {
        this.Viajes = Viajes;
    }

    public String getPromociones() {
        return Promociones;
    }

    public void setPromociones(String Promociones) {
        this.Promociones = Promociones;
    }

    public String getDestinoAn() {
        return DestinoAn;
    }

    public void setDestinoAn(String DestinoAn) {
        this.DestinoAn = DestinoAn;
    }
    
       //Metodo para elegir entre las categorias
    public void VuelosM()
    {
        int destino;
        //esto es para almacenar el numero que se pidio
        Scanner number =new Scanner(System.in);
        //variable para poder almacenar el dato elegido
        int num;
 
        num=number.nextInt();
        //Esto es para comprobar la opcion de categoria que se a elegido y mostrarlo
        //Esta es para la categoria Vuelos
        if (num==1) {
            Scanner vuelo=new Scanner(System.in);
            System.out.println("Haz elegido la categoria vuelos");
         
        //constructor 
         Scanner destin=new Scanner(System.in);
      //devuelve lugares para viajar
         System.out.println("Elija hacia adonde le gustaria viajar"+Viajes);
         
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

   
     
}
