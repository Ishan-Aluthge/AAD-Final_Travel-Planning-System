package lk.ijse.gdse.service;

import lk.ijse.gdse.dto.VehicleDTO;
import lk.ijse.gdse.exception.DeleteFailException;
import lk.ijse.gdse.exception.NotFoundException;
import lk.ijse.gdse.exception.SaveFailException;
import lk.ijse.gdse.exception.UpdatefailException;

import java.util.List;

public interface VehicleService {
    int saveVehicle(VehicleDTO dto) throws SaveFailException;

    VehicleDTO searchVehicle(int id) throws NotFoundException;

    List<VehicleDTO> searchByCategory(String category) throws NotFoundException;

    void updateVehicle(VehicleDTO dto) throws UpdatefailException;

    void deleteVehicle(int id) throws NotFoundException, DeleteFailException;

}
