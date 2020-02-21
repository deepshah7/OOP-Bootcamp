public class Engine implements EngineInterface {
    private int rpm = 0;
    private FuelTank fuelTank;

    public Engine(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public void speedUp() {
        rpm += 1;
        fuelTank.useFuel(rpm);
    }

    @Override
    public void slowDown() {
        if (rpm ==  0) return;
        rpm -= 1;
        fuelTank.useFuel(rpm);
    }

    @Override
    public int checkRPM() {
        return rpm;
    }
}
