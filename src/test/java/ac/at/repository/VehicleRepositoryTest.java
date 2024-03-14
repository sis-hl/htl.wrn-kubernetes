package ac.at.repository;

import ac.at.entity.Vehicle;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class VehicleRepositoryTest {

    @Inject
    VehicleRepository vehicleRepository;

    @Test
    @Transactional
    void createVehicleSmokeTest() {
        var myCar=new Vehicle("Opel", "Kadett");
        vehicleRepository.persist(myCar);
    }
}
