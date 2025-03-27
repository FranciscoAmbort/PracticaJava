package Adapter;

public class MySQLDataBase {
    public void mysqlConnect(String host, String user, String password) {
        System.out.println("Conectado a MySQL en " + host + " como " + user);
    }

    public void mysqlQuery(String sql) {
        System.out.println("Ejecutando consulta MySQL: " + sql);
    }

    public void mysqlDisconnect() {
        System.out.println("Desconectado de MySQL");
    }
}
