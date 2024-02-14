import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la estatura en metros: ");
        double estatura = scanner.nextDouble();

        Persona persona = new Persona(peso, estatura);

        double imc = persona.calcularIMC();

        String clasificacion = IMCCalculadora.clasificarIMC(imc);

        System.out.println("\nResultado:");
        System.out.println("IMC: " + imc);
        System.out.println("Clasificación: " + clasificacion);

        scanner.close();
    }
}