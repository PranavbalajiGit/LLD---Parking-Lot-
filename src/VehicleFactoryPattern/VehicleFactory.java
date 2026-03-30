package VehicleFactoryPattern;

import ParkingFare.ParkingFeeStartegy;
import VehicleFactoryPattern.ConcreteVehicle.BikeVehicle;
import VehicleFactoryPattern.ConcreteVehicle.CarVehicle;
import VehicleFactoryPattern.ConcreteVehicle.OtherVehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType , String licensePlate , ParkingFeeStartegy feeStartegy) {
        if("car".equalsIgnoreCase(vehicleType)) {
            return new CarVehicle(vehicleType , licensePlate , feeStartegy);
        }
        else if("bike".equalsIgnoreCase(vehicleType)) {
            return new BikeVehicle(vehicleType , licensePlate , feeStartegy);
        }
        else {
            return new OtherVehicle(vehicleType , licensePlate , feeStartegy);
        }
    }
}
