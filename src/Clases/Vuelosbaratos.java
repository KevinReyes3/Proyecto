
package Clases;


public class Vuelosbaratos extends Catalogo{
           //Atributos
    private String tipoPasajero;
    private String cantidadPasajero;
    
    //Constructor sin argumentos
    public Vuelosbaratos(){
        super(); //Llamar al constructor padre
        this.tipoPasajero="";
        this.cantidadPasajero="";
        
        
    }
    //constructor con argumentos
    public Vuelosbaratos(String Destinos, String Ida,String Vuelta,  String tipoPasajero,String cantidadPasajero){
        super(Destinos,Ida,Vuelta );
        this.tipoPasajero= tipoPasajero;
        this.cantidadPasajero=cantidadPasajero;
        
    }
        public Vuelosbaratos(Vuelosbaratos vuel){
        super( vuel);
        this.tipoPasajero= vuel.tipoPasajero;
        this.cantidadPasajero= vuel.cantidadPasajero;

    }

    Vuelosbaratos(String Ida, String Destinos, String cantidadPasajero, String Vuelta) {
        super(Destinos,Ida,Vuelta );
        this.tipoPasajero= tipoPasajero;
        this.cantidadPasajero=cantidadPasajero;
    }




    public String getTipoPasajero() {
        return tipoPasajero;
    }

    public void setTipoPasajero(String tipoPasajero) {
        this.tipoPasajero = tipoPasajero;
    }

    public String getCantidadPasajero() {
        return cantidadPasajero;
    }

    public void setCantidadPasajero(String cantidadPasajero) {
        this.cantidadPasajero = cantidadPasajero;
    }
        

  


}
