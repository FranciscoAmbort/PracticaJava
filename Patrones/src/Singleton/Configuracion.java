package Singleton;

public class Configuracion {

    private static Configuracion instancia;

    private String Usuario;
    private String Contrsaeña;

    private Configuracion () {
        this.Usuario = "Francisco";
        this.Contrsaeña = "123";
    }

    public static Configuracion GetInstance(){
        if (instancia == null){
            instancia = new Configuracion();
        }
        return instancia;
    }

    public void SetUsuario (String usuario){
        this.Usuario = usuario;
    }
    public String GetUsuario (){
        return Usuario;
    }

    public void SetConstraseña (String contraseña){
        this.Contrsaeña = contraseña;
    }

    public String GetContraseña (){
        return Contrsaeña;
    }
}
