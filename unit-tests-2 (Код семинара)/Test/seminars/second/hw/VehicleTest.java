package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.second.simple_shopping_cart.Cart;
import seminars.second.simple_shopping_cart.Shop;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setupCar() {
        car = new Car("Toyota", "Camry", 2020);
    }

    @BeforeEach
    void setupMotorcycle() {
        motorcycle = new Motorcycle("Honda", "CBR600RR", 2021);
    }
    @Test
    public void carIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }
    @Test
    public void carHasFourWheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void carSpeedDuringTestDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }
    @Test
    public void carStopsWhenParked() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
    @Test
    public void  motorcycleHasTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }
    @Test
    public void  motorcycleSpeedDuringTestDrive() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void  motorcycleStopsWhenParked() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}