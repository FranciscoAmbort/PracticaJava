package Package6;

public class Director extends Empleado{
    public int EmpleadosACargo;
    public Director (String nombre, double salario, String departamento, int empleadosACargo){
        super(nombre, salario,departamento);
        this.EmpleadosACargo= empleadosACargo;
    }
}
