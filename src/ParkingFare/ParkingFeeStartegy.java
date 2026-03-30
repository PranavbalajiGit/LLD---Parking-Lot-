package ParkingFare;


import CommonEnum.DurationType;

public interface ParkingFeeStartegy {
    double calculateFee(String vehicleType , int duration , DurationType durationType);
}
