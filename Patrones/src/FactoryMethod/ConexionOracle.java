package FactoryMethod;

public class ConexionOracle implements Conexion{
    @Override
    public void conectar() {
        System.out.println("Conectado a Oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado de Oracle");
    }

    @Override
    public String GetTipo() {
        return "Oracle";
    }
}
