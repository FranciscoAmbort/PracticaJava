package Builder;

public class Casa {
    private final int habitaciones;
    private final double metrosCuadrados;
    private final int cocheras;

    public Casa(int habitaciones, double metrosCuadrados, int cocheras) {
        this.habitaciones = habitaciones;
        this.metrosCuadrados = metrosCuadrados;
        this.cocheras = cocheras;
    }

    // Getters
    public int getHabitaciones() {
        return habitaciones;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public int getCocheras() {
        return cocheras;
    }
}
