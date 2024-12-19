
package com.taxi;

import com.taxi.vehicles.*;
import com.taxi.taxiFleet.TaxiFleet;

public class Main {
    public static void main(String[] args) {
        // Створення автомобілів
        Sedan sedan = new Sedan("Toyota Camry", 25000, 7.8, 210);
        SUV suv = new SUV("Nissan Rogue", 30000, 9.5, 200);
        Hatchback hatchback = new Hatchback("Ford Focus", 20000, 6.5, 180);

        
        TaxiFleet taxiFleet = new TaxiFleet();
        taxiFleet.addCar(sedan);
        taxiFleet.addCar(suv);
        taxiFleet.addCar(hatchback);

        // Підрахунок загальної вартості парку
        System.out.println("Total cost of taxi fleet: $" + taxiFleet.getTotalCost());

        // Сортування за витратою палива
        System.out.println("Cars sorted by fuel consumption:");
        taxiFleet.sortByFuelConsumption().forEach(System.out::println);

        // Пошук автомобілів у діапазоні швидкості
        System.out.println("Cars with speed in range 180 - 220 km/h:");
        taxiFleet.findCarsBySpeedRange(180, 220).forEach(System.out::println);
    }
}

