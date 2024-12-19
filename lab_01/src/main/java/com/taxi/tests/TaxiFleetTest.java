
package com.taxi.tests;

import com.taxi.vehicles.Sedan;
import com.taxi.vehicles.SUV;
import com.taxi.vehicles.Hatchback;
import com.taxi.taxiFleet.TaxiFleet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaxiFleetTest {
    private TaxiFleet taxiFleet;

    @BeforeEach
    public void setUp() {
        taxiFleet = new TaxiFleet();
        taxiFleet.addCar(new Sedan("Toyota Camry", 25000, 7.8, 210));
        taxiFleet.addCar(new SUV("Nissan Rogue", 30000, 9.5, 200));
        taxiFleet.addCar(new Hatchback("Ford Focus", 20000, 6.5, 180));
    }

    @Test
    public void testTotalCost() {
        assertEquals(75000, taxiFleet.getTotalCost(), 0.001);
    }

    @Test
    public void testSortByFuelConsumption() {
        assertEquals("Ford Focus", taxiFleet.sortByFuelConsumption().get(0).getModel());
    }

    @Test
    public void testFindCarsBySpeedRange() {
        assertTrue(taxiFleet.findCarsBySpeedRange(180, 210).stream()
                .anyMatch(car -> car.getModel().equals("Toyota Camry")));
    }
}
