package com.parkit.parkingsystem.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;

@Getter
@Setter
public class Ticket {
    private int id;
    private ParkingSpot parkingSpot;
    private String vehicleRegNumber;
    private double price;
    private Date inTime;
    private Date outTime;

    private Ticket(Builder builder) {
        this.id = builder.id;
        this.parkingSpot = builder.parkingSpot;
        this.vehicleRegNumber = builder.vehicleRegNumber;
        this.price = builder.price;
        this.inTime = builder.inTime;
        this.outTime = builder.outTime;
    }

    public static class Builder{
        private int id;
        private ParkingSpot parkingSpot;
        private String vehicleRegNumber;
        private double price;
        private Date inTime;
        private Date outTime;

        public Builder(){

        }

        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder parkingSpot(ParkingSpot parkingSpot){
            this.parkingSpot = parkingSpot;
            return this;
        }

        public Builder vehicleRegNumber(String vehicleRegNumber){
            this.vehicleRegNumber = vehicleRegNumber;
            return this;
        }

        public Builder price(double price){
            this.price = price;
            return this;
        }

        public Builder outTime(Date outTime) {
            this.outTime = outTime;
            return this;
        }

        public Builder inTime(Date inTime) {
            this.inTime = inTime;
            return this;
        }

        public Ticket build(){
            return new Ticket(this);
        }
    }

}
