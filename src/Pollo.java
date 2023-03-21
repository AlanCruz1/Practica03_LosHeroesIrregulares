/**
 * Clase pública que define el comportamiento del pollo
 * 
 * @author Cruz Cruz Alan Josue
 * @author Cruz Vargas Uziel Vidal
 * @author Villa Padila Juan Carlos
 * @version marzo 2023
 */
public class Pollo extends Ingredientes{

    public Pollo(Baguette chicle){
        super(chicle);
        if (this.getPollos() > 3){
            throw new RuntimeException("No se pueden agregar mas de 3 pollo");
        }   
    }

    /**
     * Metodo getDescripcion que muestra un string con el ingrediente que se selecciono.
     * 
     * @return descripcion La decripcion del ingrediente agregado.
     */
    public String getDescripcion(){
        return this.chicle.getDescripcion() + ", Pollo";
    }

    /**
     * Método getPrecio que regresa un double con el precio del chicle(o núcleo) más el 
     * precio del ingrediente selecccionado
     * 
     * @returnn precio Precio del ingrdiente junto con el precio del chicle.
     */
    public double getPrecio(){
        return 2 + this.chicle.getPrecio();
    }

    /**
     * Método getCantidad que regresa la cantidad de este ingrediente.
     * 
     * @return cantidad La cantidad de este ingrediente en el pedido.
     */
    public int getPollos(){
        return 1 + this.chicle.getPollos();
    }
}
