package lk.ijse.gdse.aad.Repo;

import lk.ijse.gdse.aad.Entity.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AuthenticateRepo extends CrudRepository<Admin, String> {

    Admin findByEmail(String email);
}
