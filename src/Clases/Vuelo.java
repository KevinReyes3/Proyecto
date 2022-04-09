
package Clases;

public class Vuelo extends Catalogo {
       //Atributos
    private String ClaseViaje;
    private String Mdestinos;
    
    //Constructor sin argumentos
    public Vuelo(){
        super(); //Llamar al constructor padre
        this.ClaseViaje="";
        this.Mdestinos="";
        
        
    }
    //constructor con argumentos
    public Vuelo(String Destinos, String Ida, String Vuelta, String ClaseViaje,String Mdestinos){
        super( Destinos,  Ida,  Vuelta);
        this.ClaseViaje= ClaseViaje;
        this.Mdestinos=Mdestinos;
        
    }
        public Vuelo(Vuelo vuel){
        super( vuel);
        this.ClaseViaje= vuel.ClaseViaje;
        this.Mdestinos= vuel.Mdestinos;
        
    }

  

    public String getClaseViaje() {
        return ClaseViaje;
    }

    public void setClaseViaje(String ClaseViaje) {
        this.ClaseViaje = ClaseViaje;
    }

    public String getMdestinos() {
        return Mdestinos;
    }

    public void setMdestinos(String Mdestinos) {
        this.Mdestinos = Mdestinos;
    }

    @Override
    public int Cmbi() {
        return 0;
    }
 
}
