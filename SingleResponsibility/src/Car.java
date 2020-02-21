public class Car {

    private FuelTank fuelTank;
    private Engine engine;

    public Car(int initialFuelLevel){
        fuelTank = new FuelTank(initialFuelLevel);
        engine = new Engine(fuelTank);
    }

    public void fillUp(int amount) {
        fuelTank.fillUp(amount);
    }

    public int checkFuelLevel() {
        return fuelTank.checkFuelLevel();
    }

    public void speedUp() {
        engine.speedUp();
    }

    public int checkRPM() {
        return engine.checkRPM();
    }

    public void slowDown() {
        engine.slowDown();
    }
}
