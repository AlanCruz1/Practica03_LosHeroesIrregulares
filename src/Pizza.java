/**
 * Clase abstracta que define el comportamiento de una pizza
 * 
 * @author Cruz Cruz Alan Josue
 * @author Cruz Vargas Uziel Vidal
 * @author Villa Padila Juan Carlos
 * @version marzo 2023
 */

 public abstract class Pizza{

    /**
     * Atributo cadena que representa el queso
     */
    protected String queso;

    /**
     * Atributo cadena que representa la carne
     */
    protected String carne;

    /**
     * Atributo cadena que representa la masa
     */
    protected String masa;

    /**
     * Atributo doble que representa el precio
     */
    protected double precio;

    /**
     * Método de acceso al queso
     */
    public String getQueso(){
        return queso;
    }

    /**
     * Método de acceso a la carne
     */
    public String getCarne(){
        return carne;
    }

    /**
     * Método de acceso a la masa
     */
    public String getMasa(){
        return masa;
    }   

    /**
     * Método de acceso al precio
     */ 
    public double getPrecio(){
        return precio;
    }


 }