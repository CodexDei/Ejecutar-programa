import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ping {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ping -c 4 google.com");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            int exitCode = process.waitFor();
            System.out.println("Exited with code: " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
