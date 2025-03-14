package Package3;

public class Punto
{
    public int X;
    public int Y;

    public Punto(int x, int y){
        X = x;
        Y = y;
    }

    public double CalcularDistancia ()
    {
        return Math.hypot(X,Y);
    }
}
