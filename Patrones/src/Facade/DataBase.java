package Facade;

public interface DataBase {
    void Connect(String type, String password);
    void Execute(String command);
    void Disconnect();

}
