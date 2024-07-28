package lk.ijse.gdse.aad.service;



import lk.ijse.gdse.aad.dto.TravelPackageDTO;
import lk.ijse.gdse.aad.exception.*;

import java.util.List;


public interface TravelPackageService {

    public String save(TravelPackageDTO obj) throws SaveFailException;
    void update(TravelPackageDTO obj) throws UpdateFailException;
    void delete(String id) throws DeleteFailException;
    List<TravelPackageDTO> getPackagesByCategory(String category);
    TravelPackageDTO fidById(String id) throws NotFoundException;
    List<TravelPackageDTO> findByCategory(String category) throws NotFoundException;
    String generateNextId();
}
