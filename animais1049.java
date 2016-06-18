import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner teclado = new Scanner(System.in);

        String x1 = teclado.nextLine();
        

        String x2 = teclado.nextLine();
        

        String x3 = teclado.nextLine();
        
        
       switch (x1){
           case "vertebrado":
               switch (x2){
                   case "ave":
                       if ("carnivoro".equals(x3)){
                           System.out.println("aguia");
                       }
                       else if ("onivoro".equals(x3)){
                           System.out.println("pomba");
                       }
                       break;
                   case "mamifero":
                       if ("onivoro".equals(x3)){
                           System.out.println("homem");
                       }
                       else if ("herbivoro".equals(x3)){
                           System.out.println("vaca");
                       }
                       break;
               }
           case "invertebrado":
               switch (x2){
                   case "inseto":
                       if ("hematofago".equals(x3)){
                           System.out.println("pulga");
                       }
                       else if ("herbivoro".equals(x3)){
                           System.out.println("lagarta");
                       }
                       break;
                   case "anelideo":
                       if ("hematofago".equals(x3)){
                           System.out.println("sanguessuga");
                       }
                       else if ("onivoro".equals(x3)){
                           System.out.println("minhoca");
                       }
                       break;
               }
               
       }

    }
}    


