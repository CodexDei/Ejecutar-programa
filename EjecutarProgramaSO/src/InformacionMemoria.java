public class InformacionMemoria {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria total: " + runtime.totalMemory());
        System.out.println("Memoria libre: " + runtime.freeMemory());
        System.out.println("Memoria máxima: " + runtime.maxMemory());
        runtime.gc(); // Sugerencia para ejecutar el recolector de basura
        System.out.println("Memoria libre después de GC: " + runtime.freeMemory());
    }
}
