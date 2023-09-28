import java.util.Scanner;

public class Sueldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de horas a la jornada: ");
        double horasDiarias = scanner.nextDouble();

        System.out.print("Cantidad de dias al mes trabajado: ");
        int diasXmes = scanner.nextInt();

        System.out.print("Cuanto cobra por hora: ");
        double cobradoXhora = scanner.nextDouble();

        double sueldo = horasDiarias * diasXmes * cobradoXhora;

        System.out.println("El sueldo del trabajador es: " + sueldo);

        scanner.close();
    }
}

