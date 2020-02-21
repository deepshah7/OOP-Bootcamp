public class Car {
    private int speed = 0;
    protected int step = 1;

    public void accelerate() {
        speed += step;
    }

    public void decelerate() {
        speed -= step;
    }
    
    public int getSpeed(){
    	return speed;
    }
}
