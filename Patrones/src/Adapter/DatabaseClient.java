package Adapter;

public class DatabaseClient {
    public static void main(String[] args) {
        // Servicios existentes
        MySQLDataBase mySQL = new MySQLDataBase();
        MongoDB mongoDB = new MongoDB();

        // Crear adaptadores
        DataBaseAdapter mysqlAdapter = new MySQLAdapter(mySQL);
        DataBaseAdapter mongoAdapter = new MongoDBAdapter(mongoDB);

        // Usar las bases de datos a través de la interfaz común
        useDatabase(mysqlAdapter, "localhost:root:password", "SELECT * FROM users");
        useDatabase(mongoAdapter, "mongodb://localhost:27017/mydb", "users|{name: 'John'}");
    }

    public static void useDatabase(DataBaseAdapter adapter, String connection, String query) {
        adapter.connect(connection);
        adapter.execute(query);
        adapter.disconnect();
        System.out.println("----------------------");
    }
}
