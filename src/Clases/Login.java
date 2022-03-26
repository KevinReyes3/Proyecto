
package Clases;

import java.awt.List;
import Clases.Persona;
import java.util.ArrayList;
/**
 *
 * @author KevinR
 */
public class Login extends Persona {
    private final int codLogin;
     public ArrayList<Persona> listausuario;
    
 
    
 
    public Login(int codLogin, String nomb, String ape, String Dire, String user, String CorrEle, String pass, int edad, String dui) {
        super(nomb, ape, Dire, user, CorrEle, pass, edad, dui);
        this.codLogin = codLogin;
         listausuario= new ArrayList<>();   
    }
    

   public String mostrardatos(){
      return ("Codigo Login "+codLogin+
               "/nNombre "+getnombre()+
               "/nApellidos "+getapellidos()+
               "/nUsuario "+getusuario()+
               "/nContraseña "+getcontra());
   }
   public int buscar(String usuario){
   int n=-1;
       for (int i = 0; i < listausuario.size(); i++) {
           if (listausuario.get(i).getusuario().equals(usuario)){
           n=i; 
           break;
           }
       }
       return n;
   }
   public boolean insertar(Persona usuario){
       if (buscar(usuario.getusuario())==-1){
           listausuario.add(usuario);
           return true;
       }else {
       return false;
       }
   
   }
     public boolean modificar(Persona usuario){
            if (buscar(usuario.getusuario())!=-1){
          Persona usaurioaux=obtener(usuario.getusuario());
                usaurioaux.setContra(usuario.getcontra());
           return true;
       }else {
       return false;
       }
   }
       public boolean Eliminar(String usuario){
            if (buscar(usuario)!=-1){
          listausuario.remove(buscar(usuario));
           return true;
       }else {
       return false;
       }
   
   }
         public Persona obtener(String usuario){
             if (buscar(usuario)!=-1) {
                 return listausuario.get(buscar(usuario));
                  }else{
             return null;
             }
           
   }

    
}
