package Adapter;

public interface DataBaseAdapter {
    void connect(String connectionDetails);
    void execute(String command);
    void disconnect();
}
