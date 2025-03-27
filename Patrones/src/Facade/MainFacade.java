package Facade;

public class MainFacade {
    public static void main(String[] args) {
        DataBaseFacade db = new DataBaseFacade();

        // Probar conexión y operaciones en MySQL
        System.out.println("=== Prueba con MySQL ===");
        db.Connect("MySQL", "localhost:root:1234");
        db.Execute("SELECT * FROM usuarios;");
        db.Disconnect();

        // Separador
        System.out.println("\n------------------------------\n");

        // Probar conexión y operaciones en MongoDB
        System.out.println("=== Prueba con MongoDB ===");
        db.Connect("MongoDB", "mongodb/localhost:27017");
        db.Execute("users:{age: {$gt: 30}}"); // Buscar en colección "users"
        db.Disconnect();
    }
}
