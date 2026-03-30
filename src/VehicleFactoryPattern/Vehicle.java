package VehicleFactoryPattern;

import ParkingFare.ParkingFeeStartegy;

public class Vehicle {
    private String licensePlate;
    private String vehicleType;
    private ParkingFeeStartegy feeStrategy;

    public Vehicle(String licensePlate, String vehicleType, ParkingFeeStartegy feeStrategy) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.feeStrategy = feeStrategy;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public ParkingFeeStartegy getFeeStrategy() {
        return feeStrategy;
    }
}
