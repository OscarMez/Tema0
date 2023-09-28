import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerDatos {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            // Llegir una cadena (String)
            System.out.print("Introduce una frase: ");
            String frase = br.readLine();
            System.out.println("Has introducido: " + frase);

            // Llegir un enter (int)
            System.out.print("Introduce un numero entero: ");
            int entero = Integer.parseInt(br.readLine());
            System.out.println("Has introducido: " + entero);

            // Llegir un número de coma flotant (float)
            System.out.print("Introduce un numero de coma flotante (con punto): ");
            float flotante = Float.parseFloat(br.readLine());
            System.out.println("Has introducido: " + flotante);

            // Llegir un número de coma flotant (double)
            System.out.print("Introduce un numero de coma flotante (con punto) (double): ");
            double doble = Double.parseDouble(br.readLine());
            System.out.println("Has introducido: " + doble);

        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: No has introducido un numero válido.");
        } finally {
            try {
                br.close();
                isr.close();
            } catch (IOException e) {
                System.out.println("Error en cerrar los recursos: " + e.getMessage());
            }
        }
    }
}

