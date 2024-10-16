import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static final String FILE = "ficheroSalida.txt";

    public static int contar() throws IOException {
       
        int numLinea = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("kelvin.txt"))) {

            while (reader.readLine() != null) {
                numLinea++;

            }
        }

        return numLinea;

    }

    public static void escribir(String datos) throws IOException {
        File fich = new File(FILE);
        try (FileOutputStream fout = new FileOutputStream(fich)) {
            fout.write(datos.getBytes());
        }
    }

    public static void main(String[] args) throws Exception {

        int contadorLineas= contar();
        escribir(String.valueOf(contadorLineas));
    }
}
