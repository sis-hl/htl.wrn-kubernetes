package ac.at.repository;

import ac.at.entity.Vehicle;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped//wie @Singleton
public class VehicleRepository implements PanacheRepository<Vehicle> {

}
