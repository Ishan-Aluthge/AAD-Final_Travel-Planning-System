package lk.ijse.gdse.aad.service;

import lk.ijse.gdse.aad.dto.HotelDTO;
import lk.ijse.gdse.aad.exception.*;

import java.util.List;

public interface HotelService {
    int save(HotelDTO hotelDTO) throws SaveFailException;
    void update(HotelDTO hotelDTO) throws UpdateFailException;
    void delete(int id) throws DeleteFailException, NotFoundException;
    HotelDTO search(int id) throws NotFoundException;
    List<HotelDTO> findByStarRate(int id) throws NotFoundException;
}
