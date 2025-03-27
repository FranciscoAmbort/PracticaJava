package Package8;

public class Juego {
    public static String Jugar(String N1, String N2){
        int nN1 = (int) (Math.random()*3);
        int nN2 = (int) (Math.random()*3);
        return "Jugador llamado: " + N1 + " Saco: " + nN1 + " Jugador Llamado: " + N2 + " Saco: " + nN2;
    }
}
