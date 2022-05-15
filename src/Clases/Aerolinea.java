
package Clases;

import java.util.Scanner;

public class Aerolinea {
    public static void main (String[] args){
        Persona registrarUsuario=new Persona();
        Boletos registarBoletos= new Boletos();
        Catalogo vercatalogo=new Catalogo() {
            @Override
            public int Cmbi() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Companhia vercompanhia=new Companhia();
         Scanner numper=new Scanner(System.in);
         /*
        int num;
        System.out.println("BIENVENIDO");
         System.out.println("QUE DESEA INGRESAR AL SISTEMA");
          System.out.println("1-USUARIOS");
          System.out.println("2-BOLETOS");
          System.out.println("3-CATALOGO");
           System.out.println("4-COMPAÑIA");
            System.out.println("5-SALIR");
          num=numper.nextInt();
        
          if (num==1){
              
          }else if(num==2){
         registarBoletos.registrarBoleto();
          }else if(num==3){
              vercatalogo.VuelosM();
        }else if(num==4){
            vercompanhia.mostrar();
        }else{
            System.out.println("GRACIAS POR USUAR NUESTROS SERVIVIOS");
               System.exit(0);
        }
        */
        
    }
}
