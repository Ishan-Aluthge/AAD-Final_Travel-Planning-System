package lk.ijse.gdse.repo;

import lk.ijse.gdse.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehicleRepo extends CrudRepository<Vehicle,Integer> {
    List<Vehicle> findByCategory(String category);
}
