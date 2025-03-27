package Adapter;

public class MongoDB {

    public void mongoOpen(String connectionString) {
        System.out.println("Abierta conexión MongoDB: " + connectionString);
    }

    public void mongoFind(String collection, String query) {
        System.out.println("Buscando en " + collection + ": " + query);
    }

    public void mongoClose() {
        System.out.println("Conexión MongoDB cerrada");
    }
}
