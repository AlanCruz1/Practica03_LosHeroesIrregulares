/**
 * Clase donde se crea el pan de ajo
 * @author Cruz Cruz Alan Josue
 * @author Cruz Vargas Uziel
 * @author Villa Padila Juan Carlos
 * @version marzo 2023
 */
public class PanAjo extends Pan{

    /** 
    * Metodo que regresa el tipo de pan del sandwich, en este caso pan de ajo
    */
    public PanAjo(){
        
         descripcion = "Pan de ajo";

    }

    /** 
    * Metodo que regresa el costo del pan de ajo
    * @return El precion del pan de ajo
    */
    public double getPrecio(){
        
        return 30.0;

    }

}
