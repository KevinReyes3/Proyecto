
package Clases;


public class Companhia {
       //Atributos 
     private String nombreComp ;
     private String direccion;
     private int telefono ;
     private String correo;
     
     //constructor
  public Companhia(){
      nombreComp="Air Company Airlines";
      direccion="";
      telefono=25890570;
      correo="Aircompanyairlines@gmail.com";
  }
  public Companhia(String _nombreComp){
      this.nombreComp=_nombreComp;
  }
  //fin del constructor
    
    //Encapsulamiento 
  public String getnombreComp(){
      return this.nombreComp;
  }
  public void setnombreComp(String _nombreComp){
      this.nombreComp=_nombreComp;
  }
  
  public String getdireccion(){
      return this.direccion;
}
  public void setdireccion(String _direccion)
  {
      this.direccion=_direccion;
  }
  
  public int gettelefono(){
      return this.telefono;
  }
  public void settelefono(int _telefono)
  {
      this.telefono=_telefono;
  }
  
  public String getcorreo(){
      return this.correo;
  }
  public void setcorreo(String _correo)
  {
      this.correo=_correo;
  }
  //final del encapsulamiento
    
//metodo para mostrar la información de los atributos de la compañia
    public void mostrar()
    {
        System.out.println("Bienvenido a "+nombreComp);
        System.out.println("La dirección de nuestras oficinas es: "+direccion);
        System.out.println("El número de telefono para cualquier consulta es: "+telefono);
        System.out.println("Nuestro correo es: "+correo);
        
    }
}
