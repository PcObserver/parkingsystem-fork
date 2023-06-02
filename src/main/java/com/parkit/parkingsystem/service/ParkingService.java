package com.parkit.parkingsystem.service;

import com.parkit.parkingsystem.constants.ParkingType;
import com.parkit.parkingsystem.model.ParkingSpot;

public interface ParkingService {

    void processIncomingVehicle();

    ParkingSpot getNextParkingNumberIfAvailable();

    void processExitingVehicle();

}
