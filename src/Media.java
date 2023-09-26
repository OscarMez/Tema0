import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del alumno: ");
        String Alumno = scanner.nextLine();

        System.out.print("Nota de la primera evaluación: ");
        double notaEvaluacion1 = scanner.nextDouble();

        System.out.print("Nota de la segunda evaluación: ");
        double notaEvaluacion2 = scanner.nextDouble();

        System.out.print("Nota de la tercera evaluación: ");
        double notaEvaluacion3 = scanner.nextDouble();

        double media = (notaEvaluacion1 + notaEvaluacion2 + notaEvaluacion3) / 3;

        System.out.println("La media final del/la alumno/a " + Alumno + " es: " + media);

        scanner.close();
    }
}
