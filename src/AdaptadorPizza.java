/**
 * Clase que adapta el sistema de las pizzas al sistema baguette
 * 
 * @author Cruz Cruz Alan Josue
 * @author Cruz Vargas Uziel Vidal
 * @author Villa Padila Juan Carlos
 */
public class AdaptadorPizza implements Baguette{

    /**
     * Atributo que representa la pizza que se adapta a un baguette
     */
    private Pizza pizza;

    /**
     * Constructor de la clase
     * @param pizza
     */
    public AdaptadorPizza(Pizza pizza){
        this.pizza = pizza;
    }

    /**
     * Devuelve la descripción de la pizza
     * 
     * @return String La descripción de la pizza
     */
    @Override
    public String getDescripcion() {
        return "Tipo de carne: " + pizza.getCarne() + " \nTipo de queso: " + pizza.getQueso() + " \nTipo de masa: " + pizza.getMasa();
    }

    /**
     * Devuelve el precio de la pizza
     * 
     * @return double El precio de la pizza
     */
    @Override
    public double getPrecio() {
        return pizza.getPrecio();
    }

    /**
     * Devuelve el números de pollos en la pizza
     * 
     * @throw RuntimeException Una pizza no tiene pollos
     */
    @Override
    public int getPollos() {
        throw new RuntimeException("Una pizza no tiene pollos");
    }

    /**
     * Devuelve el número de Pepperonnis en la pizza
     * 
     * @throw RuntimeException Una pizza no cuenta pollos
     */
    @Override
    public int getPepperonis() {
        throw new RuntimeException("Una pizza no cuenta pepperonnis");
    }

    /**
     * Devuelve el número de Jamones en la pizza
     * 
     * @throw RuntimeException Una pizza no cuenta jamones
     */
    @Override
    public int getJamones() {
        throw new RuntimeException("Una pizza no cuenta jamones");
    }

    /**
     * Devuelve el número de lechugas en la pizza
     * 
     * @throw RuntimeException Una pizza no tiene lechugas
     */
    @Override
    public int getLechugas() {
        throw new RuntimeException("Una pizza no tiene lechugas");
    }

    /**
     * Devuelve el número de jitomates en la pizza
     * 
     * @throw RuntimeException Una pizza no cuenta los jitomates
     */
    @Override
    public int getJitomates() {
        throw new RuntimeException("Una pizza no cuenta los jitomates");
    }
    
    /**
     * Devuelve el número de cebollas en la pizza
     * 
     * @throw RuntimeException Una pizza no cuenta las cebollas
     */
    @Override
    public int getCebollas() {
        throw new RuntimeException("Una pizza no cuenta las cebollas");
    }

    /**
     * Devuelve el número de mostazas en la pizza
     * 
     * @throw RuntimeException Una pizza no lleva mostaza
     */
    @Override
    public int getMostazas() {
        throw new RuntimeException("Una pizza no lleva mostaza");
    }

    /**
     * Devuelve el número de mayonesas en la pizza
     * 
     * @throw RuntimeException Una pizza no lleva mayonesa
     */
    @Override
    public int getMayonesas() {
        throw new RuntimeException("Una pizza no lleva mayonesa");
    }

    /**
     * Devuelve el número de catsup en la pizza
     * 
     * @throw RuntimeException Una pizza no cuenta catsup
     */
    @Override
    public int getCatsups() {
        throw new RuntimeException("Una pizza no cuenta catsup");
    }

    
}
