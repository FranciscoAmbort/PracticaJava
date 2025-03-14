import Package1.Estudiante;
import Package3.Punto;

public class Main {


    public static void main(String args[])
    {
        Estudiante p = new Estudiante("Fran","Ambort", 46297759, 20);
        System.out.println(p.Nombre);
        System.out.println(p.Apellido);
        System.out.println(p.Dni);
        System.out.println(p.Edad);

        Punto punto = new Punto(7 , 8);
        double res = punto.CalcularDistancia();
        System.out.println(res);
    }
}