package FactoryMethod;

public class FabricaDeConexiones {
    public static Conexion ObtenerConexion (String tipo){
        if (tipo == null) {
            return null;
        }

        if (tipo.equalsIgnoreCase("MYSQL")) {
            return new ConexionSQL();
        } else if (tipo.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        }
        throw new IllegalArgumentException("Conexión no soportada: " + tipo);
    }
}
