import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.lessThan;

public class DriverTest {
	
	Driver driver;
	Driver driver2;
	Car car;
	SportsCar car2;
	Radio radio;
	
	@Before
	public void setup(){
		car = new Car();
		radio = new Radio();
		driver = new Driver(car, radio);

		car2 = new SportsCar();
        driver2 = new Driver(car2, radio);
	}

    @Test
    public void shouldSpeedUpWithSportsCar(){
        int initialSpeed = car2.getSpeed();
        driver2.speedUp();
        
    	assertThat(car2.getSpeed(), equalTo(initialSpeed + 2));
    }

    @Test
    public void shouldSpeedUp(){
        int initialSpeed = car.getSpeed();
        driver.speedUp();

    	assertThat(car.getSpeed(), greaterThan(initialSpeed));
    }

    @Test
    public void shouldSlowDown(){
    	int initialSpeed = car.getSpeed();
    	driver.slowDown();
        
    	assertThat(car.getSpeed(), lessThan(initialSpeed));
    }

    @Test
    public void shouldTurnOnRadio(){
        driver.listenToRadio();
        
        assertThat(radio.isTurnedOn(), is(true));
    }

    @Test
    public void shouldTurnOffRadioToConcentrate(){
        driver.listenToRadio();
        driver.concentrate();

        assertThat(radio.isTurnedOn(), is(false));
    }

    @Test
    public void shouldTurnRadioUpWhenFavouriteSongComesOn(){
        driver.listenToRadio();
        int initialVolume = radio.getVolume();
        
        driver.listeningToFavouriteSong();

        assertThat(radio.getVolume(), greaterThan(initialVolume));
    }

    @Test
    public void shouldTurnRadioDownToTalkToPassenger(){
        driver.listenToRadio();
        int initialVolume = radio.getVolume();
        
        driver.talkingToPassenger();

        assertThat(radio.getVolume(), lessThan(initialVolume));
    }
}
