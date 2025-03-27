package Package7Valid;

public class Validaciones {
    public static boolean validaDNI(String DNI){
        return DNI.matches("^[0-9]{7,8}$");
    }

    public static boolean ValidaCuit(String CUIT){
        return CUIT.matches("^(20|23|24|27|30|33|34)-?[0-9]{8}-?[0-9]$");
    }

    public static  boolean ValidaNombre(String Nombre){
        return Nombre.matches("^[A-Z][a-z]+( [A-Z][a-z]+)?$"); //EL + es para que este 1 o mas veces
                                                                            // El [] es un espacio y ? opcional
    }

    public static boolean ValidarEnteroPositivo (String Num){
        return Num.matches("^[0-9]+$");
    }

    public static boolean ValidarRealDecimal(String RealDecimal){
        return RealDecimal.matches("^-?[0-9]+ (\\.[0-9]+)?$");
    }

    public static boolean ValidarPatente (String Patente){
        return Patente.matches("^[0-9]{3}[a-z]{3}$");
    }

    public static  boolean ValidarFecha (String Fecha){
        return Fecha.matches("^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/([012][0-9]{3})$"); //d es para cualquier numero
    }
}



