
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;

public class Lanzador {

    private static final String[] COMANDOS = { "java", "App" };

    public static void main(String[] args) {

        try {

            Process process = Runtime.getRuntime().exec(COMANDOS);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String linea;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            process.waitFor();

            File fic = new File(App.FILE);
            FileInputStream fin = new FileInputStream(fic);
           String contenido = new String(fin.readAllBytes());
            System.out.println(contenido);
            

        } catch (Exception  e) {
            // TODO: handle exception
        }
    }

}
