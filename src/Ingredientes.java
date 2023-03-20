/**
 * Clase abstracta que define el comportamiento de los ingredientes
 * 
 * @author Cruz Cruz Alan Josue
 * @author Cruz Vargas Uziel Vidal
 * @author Villa Padila Juan Carlos
 * @version marzo 2023
 */
public abstract class Ingredientes implements Baguette{

    protected Baguette chicle;

    public Ingredientes(Baguette chicle){
        this.chicle = chicle;
    }

    public String getDescripcion(){
        return chicle.getDescripcion();
    }

    public double getPrecio(){
        return chicle.getPrecio();
    }

    public int getPollos(){
        return chicle.getPollos();
    }

    public int getPepperonis(){
        return chicle.getPepperonis();
    }

    public int getJamones(){
        return chicle.getJamones();
    }

    public int getLechugas(){
        return chicle.getLechugas();
    }

    public int getJitomates(){
        return chicle.getJitomates();
    }

    public int getCebollas(){
        return chicle.getCebollas();
    }

    public int getMostazas(){
        return chicle.getMostazas();
    }

    public int getCatsups(){
        return chicle.getCatsups();
    }

    public int getMayonesas(){
        return chicle.getMayonesas();
    }

}
