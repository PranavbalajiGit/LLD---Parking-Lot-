package VehicleFactoryPattern.ConcreteVehicle;

import ParkingFare.ParkingFeeStartegy;
import VehicleFactoryPattern.Vehicle;

public class OtherVehicle extends Vehicle {
    public OtherVehicle(String licensePlate, String vehicleType, ParkingFeeStartegy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
