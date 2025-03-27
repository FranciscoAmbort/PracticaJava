package Builder;

public interface CasaBuilder {
    void setHabitaciones(int habitaciones);
    void setMetrosCuadrados(double metrosCuadrados);
    void setCocheras(int cocheras);
    Casa build();
}
