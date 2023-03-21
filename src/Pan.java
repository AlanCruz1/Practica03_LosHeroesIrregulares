/**
 * Clase donde se crea el Baguette del cliente
 * @author Cruz Cruz Alan Josue
 * @author Cruz Vargas Uziel
 * @author Villa Padila Juan Carlos
 * @version marzo 2023
 */
public class Pan implements Baguette{

    protected String descripcion;
    private double precio;
    private int pollos;
    private int pepperonis;
    private int jamones;
    private int lechugas;
    private int jitomates;
    private int cebollas;
    private int mostazas;
    private int catsups;
    private int mayonesas;

    /**
    * Metodo que inicia la creacion de nuestro baguette
    */
    public Pan(){

        this.descripcion="Desconocida";

    } 

    /**
    * Metodo que regresa la descripcion de todos los panes y de todos los ingredientes 
    */
    public String getDescripcion(){
        
        return descripcion;

    }    

    /**
    * Metodo que regresa el el precio de todos los panes y de todos los ingredientes
    */
    public double getPrecio(){
        
        return precio;

    }

    /**
    * Metodo que regresa la cantidad de pollo que va a utilizar el cliente en su baguette
    */
    public int getPollos(){
        
        return pollos;

    }

    /**
    * Metodo que regresa la cantidad de pepperoni que va a utilizar el cliente en su baguette
    */
    public int getPepperonis(){
        
        return pepperonis;

    }

    /**
    * Metodo que regresa la cantidad de jamon que va a utilizar el cliente en su baguette
    */
    public int getJamones(){
        
        return jamones;

    }

    /**
    * Metodo que regresa la cantidad de lechuga que va a utilizar el cliente en su baguette
    */
    public int getLechugas(){
        
        return lechugas;

    }

    /**
    * Metodo que regresa la cantidad de jitomate que va a utilizar el cliente en su baguette
    */
    public int getJitomates(){
        
        return jitomates;

    }

    /**
    * Metodo que regresa la cantidad de cebolla que va a utilizar el cliente en su baguette
    */
    public int getCebollas(){
        
        return cebollas;

    }

    /**
    * Metodo que regresa la cantidad de mostaza que va a utilizar el cliente en su baguette
    */
    public int getMostazas(){
        
        return mostazas;

    }

    /**
    * Metodo que regresa la cantidad de catsup que va a utilizar el cliente en su baguette
    */
    public int getCatsups(){
        
        return catsups;

    }

    /**
    * Metodo que regresa la cantidad de mayonesa que va a utilizar el cliente en su baguette
    */
    public int getMayonesas(){
        
        return mayonesas;

    }

}
