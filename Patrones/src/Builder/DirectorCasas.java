package Builder;

public class DirectorCasas {
    public Casa ContructorCasaGrande (CasaBuilder builder){
        builder.setHabitaciones(8);
        builder.setMetrosCuadrados(500);
        builder.setCocheras(2);
        Casa casa = builder.build();
        return casa;
    }

    public Casa ContructorCasaPersonalizada (CasaBuilder builder, int hab, double metros, int coch){
        builder.setHabitaciones(hab);
        builder.setCocheras(coch);
        builder.setMetrosCuadrados(metros);
        Casa casa = builder.build();
        return casa;
    }
}
