
package com.taxi.vehicles;


public abstract class Car {
    private String model;
    private double price;
    private double fuelConsumption;
    private int maxSpeed;

    public Car(String model, double price, double fuelConsumption, int maxSpeed) {
        this.model = model;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Price: $" + price + ", Fuel consumption: " + fuelConsumption + " L/100km, Max speed: " + maxSpeed + " km/h";
    }
}

