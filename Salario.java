import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        
        try ( // Crear un objeto Scanner para capturar la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
         
            System.out.print("Ingresa tu salario bruto mensual: ");
            double salarioBruto = scanner.nextDouble();
        
            System.out.print("Ingresa el porcentaje de impuestos: ");
            double porcentajeImpuestos = scanner.nextDouble();
           
            System.out.print("Ingresa las deducciones adicionales: ");
            double deduccionesAdicionales = scanner.nextDouble();
          
            double impuesto = salarioBruto * (porcentajeImpuestos / 100);
         
            double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;
            
            System.out.println("El salario neto es: " + salarioNeto);
           
        }
    }
}
