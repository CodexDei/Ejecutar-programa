public class KillProcess {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ping -t www.google.com.co");
            Thread.sleep(5000); // Espera 5 segundos antes de terminar el proceso
            process.destroyForcibly();
            System.out.println("Process destroyed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
