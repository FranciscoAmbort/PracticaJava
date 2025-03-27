package FactoryMethod;

public class ConexionSQL implements Conexion {

    @Override
    public void conectar() {
        System.out.println("Conectado a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado de MySQL");
    }

    @Override
    public String GetTipo() {
        return "MySQL";
    }
}
