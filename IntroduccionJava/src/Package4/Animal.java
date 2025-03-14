package Package4;

public class Animal
{
    public String Nombre;
    public int Edad;

    public Animal (String nombre, int edad)
    {
        Nombre = nombre;
        Edad = edad;
    }

    public String Comunicacion (){
        if (this instanceof Perro){
            return "guau";
        }else
        {
            return "Miau";
        }
    }

}


