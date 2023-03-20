import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal donde se lleva el comportamiento del restaurante
 * @author Cruz Cruz Alan Josue
 * @author Cruz Vargas Uziel
 * @author Villa Padila Juan Carlos
 * @version marzo 2023
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        int opcionSe;
        Baguette pedido = new Pan();

        Pizza eleccion = new PizzaDosQuesos();
        

        System.out.println("********Bienvenido a WaySub********\n"); 

        do {

            System.out.println("Que va a comer hoy" + 
                            "\n  1. Baguette\n" +
                                "2. Pizza\n" +
                                "0. Salir del restaurante\n");
            while(true){

                try {

                    String entrada = sc.nextLine();
                    opcion = Integer.parseInt(entrada);
                    break;

                } catch (NumberFormatException e) {

                    System.out.println("\nOpcion invalida\n" +
                    "1. Baguette\n" +
                    "2. Pizza\n" +
                    "0. Salir del restaurante\n");

                }
            }

            switch(opcion){
                
                case 1:
                
                    do {    

                        System.out.println("Que tipo de pan quiere:");    

                        System.out.println("\n1. Pan blanco\n" +
                                    "2. Pan integral\n" +
                                    "3. Pan de centeno\n");

                        while(true){

                            try {

                                String entrada = sc.nextLine();
                                opcionSe = Integer.parseInt(entrada);

                            break;

                            } catch (Exception e) {
                                System.out.println("\nOpcion invalida\n" +
                                "1. Pan blanco\n" +
                                "2. Pan integral\n" +
                                "3. Pan de centeno\n");
                           }
                        }

                        switch(opcionSe){

                            case 1:
                        
                                pedido = new PanBlanco();

                            break;

                            case 2:
                        
                                pedido = new PanCenteno();

                            break;

                            case 3:
                        
                                pedido = new PanAjo();

                            break;

                            default:

                                System.out.println("Opcion invalida");

                            break;

                        }

                    } while (opcionSe <= 0 || opcionSe >= 4);    

                    do{

                        System.out.println("Que le  va a poner a su baguette");    

                        System.out.println("\n1. Pollo\n" +
                                    "2. Pepperoni\n" +
                                    "3. Jamon\n" +
                                    "4. Lechuga\n" +
                                    "5. Jitomate\n" +
                                    "6. Cebolla\n" +
                                    "7. Mostaza\n" +
                                    "8. Catsup\n" +
                                    "9. Mayonesa\n" +
                                    "0. Terminar orden\n");

                        while(true){

                            try {

                                String entrada = sc.nextLine();
                                opcionSe = Integer.parseInt(entrada);

                            break;

                            } catch (Exception e) {
                                System.out.println("\nOpcion invalida\n" +
                                    "1. Pollo\n" +
                                    "2. Pepperoni\n" +
                                    "3. Jamon\n" +
                                    "4. Lechuga\n" +
                                    "5. Jitomate\n" +
                                    "6. Cebolla\n" +
                                    "7. Mostaza\n" +
                                    "8. Catsup\n" +
                                    "9. Mayonesa\n" +
                                    "0. Terminar orden\n");
                           }
                        }

                        switch(opcionSe){

                            case 1:
                        
                                pedido = new Pollo(pedido);

                            break;

                            case 2:
                        
                                pedido = new Pepperoni(pedido);

                            break;

                            case 3:
                        
                                pedido = new Jamon(pedido);

                            break;  


                            case 4:
                        
                                pedido = new Lechuga(pedido);

                            break;

                            case 5:
                        
                                pedido = new Jitomate(pedido);

                            break;     

                            case 6:
                        
                                pedido = new Cebolla(pedido);

                            break;

                            case 7:
                        
                                pedido = new Mostaza(pedido);

                            break;

                            case 8:
                        
                                pedido = new Catsup(pedido);

                            break;

                            case 9:
                        
                                pedido = new Mayonesa(pedido);

                            break;

                            case 0:
                        
                                System.out.println("Terminando su orden");

                            break;  
                            
                            default:

                                System.out.println("Opcion invalida");

                            break;

                        }           

                    } while (opcionSe != 0);

                break;

                case 2:
                   
                    do{
  
                        System.out.println("Que pizza va a querer");

                        System.out.println("\n1. Pizza de pepperoni\n" +
                                    "2. Pizza de salchicha\n" +
                                    "3. Pizza de dos quesos\n" +
                                    "4. Pizza de jamon\n" +
                                    "5. Pizza de tres carnes\n");

                        while(true){
                            try {

                                String entrada = sc.nextLine();
                                opcionSe = Integer.parseInt(entrada);
                                break;

                            } catch (Exception e) {
                                System.out.println("\nOpcion invalida\n" +
                                "1. Pizza de pepperoni\n" +
                                "2. Pizza de salchicha\n" +
                                "3. Pizza de dos quesos\n" +
                                "4. Pizza de jamon\n" +
                                "5. Pizza de tres carnes\n");
                            }
                        }

                        switch(opcionSe){

                            case 1:
                        
                                pedido = new AdaptadorPizza(new PizzaPepperonni());
                                System.out.println(pedido.getDescripcion());
                                System.out.println("$"+pedido.getPrecio()+" pumadoladores");
        
                            break;

                            case 2:
                        
                                pedido = new AdaptadorPizza(new PizzaSalchicha());
                                System.out.println(pedido.getDescripcion());
                                System.out.println("$"+pedido.getPrecio()+" pumadoladores");

                            break;

                            case 3:
                        
                                pedido = new AdaptadorPizza(new PizzaDosQuesos());
                                System.out.println(pedido.getDescripcion());
                                System.out.println("$"+pedido.getPrecio()+" pumadoladores");

                            break;

                            case 4:
                        
                                pedido = new AdaptadorPizza(new PizzaJamon());
                                System.out.println(pedido.getDescripcion());
                                System.out.println("$"+pedido.getPrecio()+" pumadoladores");

                            break;

                            case 5:
                        
                                pedido = new AdaptadorPizza(new PizzaTresCarnes());
                                System.out.println(pedido.getDescripcion());
                                System.out.println("$"+pedido.getPrecio()+" pumadoladores");

                            break;

                            default:

                                System.out.println("Opcion invalida");

                            break;
                
                        }

                    } while (opcionSe <= 0 || opcionSe >= 6);

                    break;

                case 0:

                    System.out.println("Gracias por su visita");

                    break;

                default:

                    System.out.println("Opcion invalida");

                    break;  
              
            }  
      
        } while (opcion != 0);

    }

}
