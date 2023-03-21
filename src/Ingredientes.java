/**
 * Clase abstracta que define el comportamiento de los ingredientes
 * 
 * @author Cruz Cruz Alan Josue
 * @author Cruz Vargas Uziel Vidal
 * @author Villa Padila Juan Carlos
 * @version marzo 2023
 */
public abstract class Ingredientes implements Baguette{
    
    //Núcleo de la clase.
    protected Baguette chicle;
    
    /**
     * Constructor de Ingredientes 
     * 
     * @param chicle El núcleo que es el pan de baguette
     */
    public Ingredientes(Baguette chicle){
        this.chicle = chicle;
    }
    
    //Métodos abstractos
    //Agrega una capa a la descripcion del nucleo
    public abstract String getDescripcion();
    //Agrega una capa al costo del nucleo
    public abstract double getPrecio();
    
    /**
     * Metodo que agrega los metodos de pollo al chicle.
     * 
     * @return chicle El chicle con la capa de pollo.
     */
    public int getPollos(){
        return chicle.getPollos();
    }
    
    /**
     * Metodo que agrega los metodos de pepperoni al chicle.
     * 
     * @return chicle El chicle con la capa de pepperoni.
     */
    public int getPepperonis(){
        return chicle.getPepperonis();
    }
    
    /**
     * Metodo que agrega los metodos de jamón al chicle.
     * 
     * @return chicle El chicle con la capa de jamon.
     */
    public int getJamones(){
        return chicle.getJamones();
    }
    
    /**
     * Metodo que agrega los metodos de lechuga al chicle.
     * 
     * @return chicle El chicle con la capa de lechuga.
     */
    public int getLechugas(){
        return chicle.getLechugas();
    }
    
    /**
     * Metodo que agrega los metodos de jitomate al chicle.
     * 
     * @return chicle El chicle con la capa de jitomate
     */
    public int getJitomates(){
        return chicle.getJitomates();
    }
    
    /**
     * Metodo que agrega los metodos de cebolla al chicle.
     * 
     * @return chicle El chicle con la capa de cebolla
     */
    public int getCebollas(){
        return chicle.getCebollas();
    }
    
    /**
     * Metodo que agrega los metodos de mostaza al chicle.
     * 
     * @return chicle El chicle con la capa de mostaza
     */
    public int getMostazas(){
        return chicle.getMostazas();
    }
    
    /**
     * Metodo que agrega los metodos de catsup al chicle.
     * 
     * @return chicle El chicle con la capa de catsup
     */
    public int getCatsups(){
        return chicle.getCatsups();
    }
    
    /**
     * Metodo que agrega los metodos de mayonesa al chicle.
     * 
     * @return chicle El chicle con la capa de mayonesa.
     */
    public int getMayonesas(){
        return chicle.getMayonesas();
    }

}
