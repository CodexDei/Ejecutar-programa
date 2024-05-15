import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {

            if (System.getProperty("os.name").toLowerCase().contains("windows")){
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().contains("mac")){
                proceso = rt.exec("textedit");                
            } else if (System.getProperty("os.name").toLowerCase().contains("linux")
                        || System.getProperty("os.name").toLowerCase().contains("nix")){
                proceso = rt.exec("gedit");
            }else{
                proceso = rt.exec("gedit");
            }
            //queda esperando hasta que cerremos el programa
            proceso.waitFor();

        } catch (Exception e) {
            System.out.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}