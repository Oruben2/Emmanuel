import java.util.Scanner;

public class MasaCorporal {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in)) {

            System.out.print("Ingresa tu peso en kilogramos: ");
            double peso = scanner.nextDouble();
    
            System.out.print("Ingresa tu altura en metros: ");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);
   
            System.out.println("Tu Índice de Masa Corporal (IMC) es: " + imc);
            
            if (imc < 18.5) {
                System.out.println("Clasificación: Bajo peso");
            } else if (imc >= 18.5 && imc < 24.9) {
                System.out.println("Clasificación: Peso normal");
            } else if (imc >= 25 && imc < 29.9) {
                System.out.println("Clasificación: Sobrepeso");
            } else {
                System.out.println("Clasificación: Obesidad");
            }
                 }
    }
}
