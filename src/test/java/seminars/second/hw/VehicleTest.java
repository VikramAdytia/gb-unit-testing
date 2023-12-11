package seminars.second.hw;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Ford", "Mustang", 1964);
        motorcycle = new Motorcycle("Harley-Devidson", "Chopper", 1987);
    }

    @Test
    @DisplayName("Check nullable object reference")
    void carIsNotNullObject() {
        assertNotNull(car);
    }

    @Test
    @DisplayName("Check that Car is instance of Vehicle")
    void carIsInheritedFromVehicle() {
        assertTrue(car instanceof Vehicle, "The car is instance of " + car.getClass());
    }

    @Test
    @DisplayName("Check that Car has 4 wheels")
    void carHasFourWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    @DisplayName("Check that motorcycle has 2 wheels")
    void motorcycleHasTwoWheels() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    @DisplayName("Check that test drive speed is 60")
    void carTestDriveSpeed() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    @DisplayName("Check that motorcycle test drive speed is 75")
    void motorCycleTestDriveSpeed() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    @DisplayName("Check that car stops after test drive")
    void carParkingSpeed() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    @DisplayName("Check that bike stops after test drive")
    void motorcycleParkingSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }

    @AfterEach
    void tearDown() {
    }
}