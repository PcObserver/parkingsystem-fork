package com.parkit.parkingsystem.model;

import com.parkit.parkingsystem.constants.ParkingType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot {
    private int number;
    private ParkingType parkingType;
    private boolean isAvailable;

    private ParkingSpot(Builder builder) {
        this.number = builder.number;
        this.parkingType = builder.parkingType;
        this.isAvailable = builder.isAvailable;
    }

    public static class Builder{
        private int number;
        private ParkingType parkingType;
        private boolean isAvailable;

        public Builder(){

        }

        public Builder number(int number){
            this.number = number;
            return this;
        }

        public Builder parkingType(ParkingType parkingType){
            this.parkingType = parkingType;
            return this;
        }

        public Builder isAvailable(boolean isAvailable){
            this.isAvailable = isAvailable;
            return this;
        }

        public ParkingSpot build(){
            return new ParkingSpot(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSpot that = (ParkingSpot) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
