package Clases;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellidos;
    private int Edad;
    private String Direccion;
    private String Dui;
    private String usuario;
    private String correo;
    private String Contra;
    
   //Constructor 
    public Persona(){
     
    }
     public Persona(String nomb,String ape,String Dire,String user,String CorrEle,String pass,int edad,String dui ){
         this.Dui=dui;
        this.nombre=nomb;
        this.apellidos=ape;
        this.Direccion=Dire;
        this.correo=CorrEle;
        this.usuario=user;
        this.Contra=pass;
        this.Edad=edad;
    }
     public String getnombre(){
        return nombre;
        }
     public String getdui(){
        return Dui;
        }
     public String getapellidos(){
        return apellidos;
        }
     public String getDireccion(){
        return Direccion;
        }
     public String getcorreo(){
        return correo;
        }
     public String getusuario(){
        return usuario;
        }
     public int getedad(){
        return Edad;
        }
     public String getcontra(){
        return Contra;
        }
     
     public void registrarUsuario(){
         int men1;
         men1=1;
         int reswhi;
         int confir;
         Scanner nombre1=new Scanner(System.in);
         Scanner res1=new Scanner(System.in);
         Scanner res2=new Scanner(System.in);
         Scanner apellidos1=new Scanner(System.in);
         Scanner Direccion1=new Scanner(System.in);
         Scanner correo1=new Scanner(System.in);
         Scanner edad1=new Scanner(System.in);
         Scanner usuario1=new Scanner(System.in);
         Scanner contra1=new Scanner(System.in);
          Scanner dui1=new Scanner(System.in);
         while(men1==1) { 
         System.out.println("BIENVENIDO");
          System.out.println("INGRESE SU DUI FORMATO 12345678-9");
         this.Dui=dui1.nextLine();
         System.out.println("INGRESE SUS DOS NOMBRES");
         this.nombre=nombre1.nextLine();
         System.out.println("INGRESE SUS DOS APELLIDOS");
         this.apellidos=apellidos1.nextLine();
         System.out.println("INGRESE SU EDAD");
         this.Edad=edad1.nextInt();
         System.out.println("INGRESE SU DIRECCION");
         this.Direccion=Direccion1.nextLine();
          System.out.println("INGRESE SU CORREO");
         this.correo=correo1.nextLine();
           System.out.println("INGRESE SU USUARIO");
         this.usuario=usuario1.nextLine();
           System.out.println("INGRESE SU CONTRASEÑA");
         this.Contra=contra1.nextLine();
         System.out.println("1-Registrar  2-Cancelar");
         reswhi=res1.nextInt();
         if (reswhi==1){
             System.out.println("REGISTRO GUARDADO");
             men1=2;
         }else if (reswhi==2){
            System.out.println("DESEA SALIR 1-SI 2-NO");
            confir=res2.nextInt();
            if (confir==1){
            System.out.println("GRACIAS");
            men1=2;
            } else {
            men1=1;
            } 
         }
         }
     }
}
