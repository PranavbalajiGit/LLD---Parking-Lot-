package VehicleFactoryPattern.ConcreteVehicle;

import ParkingFare.ParkingFeeStartegy;
import VehicleFactoryPattern.Vehicle;

public class BikeVehicle extends Vehicle {
    public BikeVehicle(String licensePlate, String vehicleType, ParkingFeeStartegy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
