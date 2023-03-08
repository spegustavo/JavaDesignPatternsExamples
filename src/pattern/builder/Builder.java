package pattern.builder;

import pattern.builder.entity.Engine;
import pattern.builder.entity.GPSNavigator;
import pattern.builder.entity.Transmission;
import pattern.builder.entity.TripComputer;
import pattern.builder.enumBuilder.CarType;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
	
	void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
	

}
