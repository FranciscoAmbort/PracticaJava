package Package6;

public class Programador extends Empleado{
    public int NumProyectos;
    public Programador (String nombre, double salario, String departamento, int numProyectos){
        super(nombre, salario, departamento);
        this.NumProyectos = numProyectos;
    }
}
