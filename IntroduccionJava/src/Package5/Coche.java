package Package5;

public class Coche extends Vehiculo{
    public int NumeroPuertas;
    public Coche (String marca, int modelo, int numRuedas, int numeroPuertas){
        super (marca, modelo, numRuedas);
        NumeroPuertas = numeroPuertas;
    }
    @Override
    public String Descripcion (){
      return "Coche de marca:" + Marca + ", modelo:" + Modelo + ", numero de ruedas: " + NumRuedas + ", Numero de puertas:"+ NumeroPuertas;
    };
}
