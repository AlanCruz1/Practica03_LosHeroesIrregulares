/**
 * Clase donde se crea el pan de centeno 
 * @author Cruz Cruz Alan Josue
 * @author Cruz Vargas Uziel
 * @author Villa Padila Juan Carlos
 * @version marzo 2023
 */
public class PanCenteno extends Pan{    

    /** 
    * Metodo que regresa el tipo de pan del sandwich, en este caso pan de centeno
    */
    public PanCenteno(){
        
        descripcion = "Pan de centeno";

    }
   
    /** 
    * Metodo que regresa el costo del pan de centeno
    * @return El precion del pan de centeno
    */
    public double getPrecio(){
        
        return 25.0;

    }

}
