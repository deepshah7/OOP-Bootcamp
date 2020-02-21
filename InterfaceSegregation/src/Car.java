public class Car implements FuelStationInterface, DriverInterface {
    int fuelLevel;

    public Car(int intialFuelLevel){
        fuelLevel = intialFuelLevel;
    }

    @Override
    public void drive() throws OutOfFuelException {
        if(fuelLevel <= 0) throw new OutOfFuelException();
        fuelLevel -= 1;
    }

    @Override
    public void fillUpFuel() {
        fuelLevel = 10;
    }

    @Override
    public int checkFuelLevel() {
        return fuelLevel;
    }
}
