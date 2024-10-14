
import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaRectangulo2 {
    
    public static void main(String[] args) {
     
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa la longitud del rectángulo: ");
            double longitud = scanner.nextDouble();
            
            System.out.print("Ingresa la anchura del rectángulo: ");
            double anchura = scanner.nextDouble();
            
            double area = longitud * anchura;
            
            System.out.println("El área del rectángulo es: " + area);
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor ingresa valores numéricos.");
        }
    }
}
