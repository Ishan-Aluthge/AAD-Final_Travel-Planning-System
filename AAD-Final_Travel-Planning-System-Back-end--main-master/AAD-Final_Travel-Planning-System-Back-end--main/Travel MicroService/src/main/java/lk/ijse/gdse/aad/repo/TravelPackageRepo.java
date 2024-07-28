package lk.ijse.gdse.aad.repo;

import lk.ijse.gdse.aad.entity.TravelPackage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TravelPackageRepo extends CrudRepository<TravelPackage, String> {
    List<TravelPackage> findByCategory(String category);
    List<TravelPackage> findAll();

}
