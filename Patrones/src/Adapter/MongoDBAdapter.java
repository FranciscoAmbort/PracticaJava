package Adapter;

public class MongoDBAdapter implements DataBaseAdapter{
    private final MongoDB mongoDB;

    public MongoDBAdapter(MongoDB mongoDB) {
        this.mongoDB = mongoDB;
    }

    @Override
    public void connect(String connectionDetails) {
        mongoDB.mongoOpen(connectionDetails);

    }

    @Override
    public void execute(String command) {
        String[] parts = command.split("/");
        mongoDB.mongoFind(parts[0], parts[1]);
    }

    @Override
    public void disconnect() {
        mongoDB.mongoClose();
    }
}
