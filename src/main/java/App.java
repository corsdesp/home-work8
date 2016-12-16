import java.io.*;

public class App {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "UTF-16"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), "cp1251"))) {

            while (reader.ready()) {
                writer.write(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
