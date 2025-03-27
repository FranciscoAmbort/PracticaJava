package Facade;

import Adapter.MongoDB;
import Adapter.MySQLDataBase;

public class DataBaseFacade implements DataBase{
    private MySQLDataBase mysql;
    private MongoDB mongo;
    private String activeDB;

    public DataBaseFacade (){
        this.mysql = new MySQLDataBase();
        this.mongo = new MongoDB();
    }
    @Override
    public void Connect(String type, String connectionDetails) {
        if (type.equalsIgnoreCase("MySQL")) {
            String[] parts = connectionDetails.split(":");
            activeDB = "MySQL";
            mysql.mysqlConnect(parts[0], parts[1], parts[2]);
        } else if (type.equalsIgnoreCase("MongoDB")) {
            activeDB = "MongoDB";
            mongo.mongoOpen(connectionDetails);
        } else {
            System.out.println("Error: Tipo de base de datos no reconocido.");
        }
    }

    @Override
    public void Execute(String command) {
        if (activeDB == null) {
            System.out.println("Error: No hay ninguna base de datos conectada.");
            return;
        }

        if (activeDB.equals("MySQL")) {
            mysql.mysqlQuery(command);
        } else if (activeDB.equals("MongoDB")) {
           //command esta en coleccion:consulta
            String[] parts = command.split(":", 2);
            mongo.mongoFind(parts[0], parts[1]);
        }
    }

    @Override
    public void Disconnect() {
        if (activeDB == null) {
            System.out.println("Error: No hay ninguna base de datos conectada.");
            return;
        }

        if (activeDB.equals("MySQL")) {
            mysql.mysqlDisconnect();
        } else if (activeDB.equals("MongoDB")) {
            mongo.mongoClose();
        }

        activeDB = null;
    }

}

