
package com.taxi.taxiFleet;

import com.taxi.vehicles.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiFleet {
    private List<Car> cars;

    public TaxiFleet() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    // Підрахунок загальної вартості автопарку
    public double getTotalCost() {
        return cars.stream().mapToDouble(Car::getPrice).sum();
    }

    // Сортування автомобілів за витратою палива
    public List<Car> sortByFuelConsumption() {
        return cars.stream()
                .sorted(Comparator.comparingDouble(Car::getFuelConsumption))
                .collect(Collectors.toList());
    }

    // Пошук автомобілів за швидкістю
    public List<Car> findCarsBySpeedRange(int minSpeed, int maxSpeed) {
        return cars.stream()
                .filter(car -> car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed)
                .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return cars;
    }
}

