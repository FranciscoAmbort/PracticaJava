package Adapter;

public class MySQLAdapter implements DataBaseAdapter{
    private final MySQLDataBase mySQLDataBase;

    public MySQLAdapter(MySQLDataBase mySQLDataBase) {
        this.mySQLDataBase = mySQLDataBase;
    }

    @Override
    public void connect(String connectionDetails) {
        String[] parts = connectionDetails.split(":");
        mySQLDataBase.mysqlConnect(parts[0], parts[1], parts[2]);
    }

    @Override
    public void execute(String command) {
        mySQLDataBase.mysqlQuery(command);
    }

    @Override
    public void disconnect() {
        mySQLDataBase.mysqlDisconnect();
    }
}
