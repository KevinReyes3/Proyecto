
package Clases;


public class Catalogo {
    private String Destinos;
    private String Ida;
    private String Vuelta;


    public Catalogo(){
        this.Destinos = "";
        this.Ida = "";
        this.Vuelta = "";
  
    }
    
   
    //constructor con argumentos
    public Catalogo(String Destinos, String Ida, String Vuelta) {
        this.Destinos = Destinos;
        this.Ida = Ida;
        this.Vuelta = Vuelta;
 
    }
    
    //constructor copia
       public Catalogo(Catalogo cat) {
        this.Destinos = cat.Destinos;
        this.Ida = cat.Ida;
        this.Vuelta = cat.Vuelta;
     
    }

    Catalogo(String Destinos, String Ida, String Vuelta, String MDestinos, String ClaseViaje) {
    }

    public String getDestinos() {
        return Destinos;
    }

    public void setDestinos(String Destinos) {
        this.Destinos = Destinos;
    }

    public String getIda() {
        return Ida;
    }

    public void setIda(String Ida) {
        this.Ida = Ida;
    }

    public String getVuelta() {
        return Vuelta;
    }

    public void setVuelta(String Vuelta) {
        this.Vuelta = Vuelta;
    }

       
    
    
}
