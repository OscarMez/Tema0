import java.io.*;

public class LecturaEscritura {

    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";

        leer(nombreArchivo);

        escribir(nombreArchivo);
    }

    public static void leer(String nombreArchivo) {
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            System.out.println("Contenido del archivo:");

            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error en leer el archivo: " + e.getMessage());
        }
    }

    public static void escribir(String nombreArchivo) {
        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo, true); // El segon paràmetre true indica que afegim al final
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Escribe el texto que quieras implementar en el archivo: ");
            String text = teclado.readLine();

            printWriter.println(text);

            printWriter.close();
        } catch (IOException e) {
            System.err.println("Error en escribir en el archivo: " + e.getMessage());
        }
    }
}
