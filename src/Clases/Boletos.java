
package Clases;
import java.util.Scanner;

public class Boletos {
    private String nombre;
    private String CodBoleto;
    private String CodAvion;
    private int Asiento;
    private String Destino;
    private String VueloIda;
    private String VueloVenida;
    private String ClaseViaje;
    private double precio;
    
    public Boletos(){
    }
    public Boletos(String nomB, String CodB,String CodA, int Asi, String Des,String VI,String VuV,String CViaje,double pre){
        this.nombre=nomB;
        this.CodBoleto=CodB;
        this.CodAvion=CodA;
        this.Asiento=Asi;
        this.Destino=Des;
        this.VueloIda=VI;
        this.VueloVenida=VuV;
        this.ClaseViaje=CViaje;
        this.precio=pre;
   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodBoleto() {
        return CodBoleto;
    }

    public void setCodBoleto(String CodBoleto) {
        this.CodBoleto = CodBoleto;
    }

    public String getCodAvion() {
        return CodAvion;
    }

    public void setCodAvion(String CodAvion) {
        this.CodAvion = CodAvion;
    }

    public int getAsiento() {
        return Asiento;
    }

    public void setAsiento(int Asiento) {
        this.Asiento = Asiento;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getVueloIda() {
        return VueloIda;
    }

    public void setVueloIda(String VueloIda) {
        this.VueloIda = VueloIda;
    }

    public String getVueloVenida() {
        return VueloVenida;
    }

    public void setVueloVenida(String VueloVenida) {
        this.VueloVenida = VueloVenida;
    }

    public String getClaseViaje() {
        return ClaseViaje;
    }

    public void setClaseViaje(String ClaseViaje) {
        this.ClaseViaje = ClaseViaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getnombre(){
        return nombre;
        }
    /*  public void registrarBoleto(){
         int men1;
         men1=1;
         int reswhi;
         int confir;
         Scanner res1=new Scanner(System.in);
         Scanner res2=new Scanner(System.in);
         Scanner nombre1=new Scanner(System.in);
         Scanner CodBoleto1=new Scanner(System.in);
         Scanner CodAvion1=new Scanner(System.in);
         Scanner Asiento1=new Scanner(System.in);
         Scanner Destino1=new Scanner(System.in);
         Scanner VueloIda1=new Scanner(System.in);
         Scanner VueloVenida1=new Scanner(System.in);
          Scanner ClaseViaje1=new Scanner(System.in);
          Scanner precio1=new Scanner(System.in);
         while(men1==1) { 
         System.out.println("BIENVENIDO");
          System.out.println("INGRESE SU CODIGO DE BOLETO");
         this.CodBoleto=CodBoleto1.nextLine();
         System.out.println("INGRESE NOMBRE DEL BOLETO");
         this.nombre=nombre1.nextLine();
         System.out.println("INGRESE SU CODIGO DEL AVION");
         this.CodAvion=CodAvion1.nextLine();
         System.out.println("INGRESE EL ASIENTO DEL BOLETO");
         this.Asiento=Asiento1.nextInt();
         System.out.println("INGRESE EL DESTINO DEL VUELO");
         this.Destino=Destino1.nextLine();
          System.out.println("INGRESE FECHA DE VUELO");
         this.VueloIda=VueloIda1.nextLine();
           System.out.println("INGRESE FECHA DE VUELO DE RETORNO");
         this.VueloVenida=VueloVenida1.nextLine();
           System.out.println("INGRESE LA CLASE DEL VIAJE");
         this.ClaseViaje=ClaseViaje1.nextLine();
         System.out.println("INGRESE PRECIO DEL BOLETO $");
         this.precio=precio1.nextDouble();
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
        private String nombre;
    private String CodBoleto;
    private String CodAvion;
    private int Asiento;
    private String Destino;
    private String VueloIda;
    private String VueloVenida;
    private String ClaseViaje;
    private double precio;
         }
         }
     }*/
        public String getDatos(){
        return "Codigo_Boleto: "+CodBoleto+
                "\nNombre "+nombre +
                "\nCodigo_Avion "+CodAvion+
                "\nAsiento "+Asiento+
                "\nDestino "+Destino+
                "\nVuelo_Ida "+VueloIda+
                "\nVuelo_Venida "+VueloVenida+
                "\nClase_Viaje "+ClaseViaje+
                "\nPrecio "+precio
                ;
    }
}
