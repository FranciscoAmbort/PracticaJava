package Package5;

public abstract class Vehiculo {
    public String Marca;
    public int Modelo;
    public int NumRuedas;

    public Vehiculo(String marca, int modelo, int numRuedas){
        Marca = marca;
        Modelo = modelo;
        NumRuedas = numRuedas;
    }

     public abstract String Descripcion ();
}
