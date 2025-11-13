package parkinglot.vehicle;

/**
 * CAR EXTENDING VEHICLE
 */
public class Car extends Vehicle {
    public Car(String licenseNumber) {
        super(licenseNumber, VehicleSize.MEDIUM);
    }
}
