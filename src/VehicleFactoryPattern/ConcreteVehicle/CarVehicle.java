package VehicleFactoryPattern.ConcreteVehicle;

import ParkingFare.ParkingFeeStartegy;
import VehicleFactoryPattern.Vehicle;

public class CarVehicle extends Vehicle {
    public CarVehicle(String licensePlate , String vehicleType , ParkingFeeStartegy feeStartegy) {
        super(licensePlate , vehicleType , feeStartegy);
    }
}
