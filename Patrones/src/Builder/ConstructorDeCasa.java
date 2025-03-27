package Builder;

public class ConstructorDeCasa implements CasaBuilder {
    private int Habitaciones;
    private double MetrosCuadrados;
    private int Cocheras;
    @Override
    public void setHabitaciones(int habitaciones) {
        this.Habitaciones = habitaciones;

    }

    @Override
    public void setMetrosCuadrados(double metrosCuadrados) {
        this.MetrosCuadrados = metrosCuadrados;
    }

    @Override
    public void setCocheras(int cocheras) {
        this.Cocheras = cocheras;
    }

    @Override
    public Casa build() {
        return new Casa(Habitaciones, MetrosCuadrados, Cocheras);
    }
}
