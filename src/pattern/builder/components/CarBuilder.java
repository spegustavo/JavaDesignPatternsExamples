package pattern.builder.components;

import pattern.builder.Builder;
import pattern.builder.entity.Car;
import pattern.builder.entity.Engine;
import pattern.builder.entity.GPSNavigator;
import pattern.builder.entity.Transmission;
import pattern.builder.entity.TripComputer;
import pattern.builder.enumBuilder.CarType;

public class CarBuilder implements Builder {
	
	 private CarType type;
	    private int seats;
	    private Engine engine;
	    private Transmission transmission;
	    private TripComputer tripComputer;
	    private GPSNavigator gpsNavigator;

	    public void setCarType(CarType type) {
	        this.type = type;
	    }

	    @Override
	    public void setSeats(int seats) {
	        this.seats = seats;
	    }

	    @Override
	    public void setEngine(Engine engine) {
	        this.engine = engine;
	    }

	    @Override
	    public void setTransmission(Transmission transmission) {
	        this.transmission = transmission;
	    }

	    @Override
	    public void setTripComputer(TripComputer tripComputer) {
	        this.tripComputer = tripComputer;
	    }

	    @Override
	    public void setGPSNavigator(GPSNavigator gpsNavigator) {
	        this.gpsNavigator = gpsNavigator;
	    }

	    public Car getResult() {
	        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	    }

}
