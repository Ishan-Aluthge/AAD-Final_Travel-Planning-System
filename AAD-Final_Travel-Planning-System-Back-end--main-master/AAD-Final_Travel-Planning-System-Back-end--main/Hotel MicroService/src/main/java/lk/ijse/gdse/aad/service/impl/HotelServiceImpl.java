package lk.ijse.gdse.aad.service.impl;

import lk.ijse.gdse.aad.dto.HotelDTO;
import lk.ijse.gdse.aad.service.HotelService;
import lk.ijse.gdse.aad.exception.*;
import java.util.List;

public class HotelServiceImpl implements HotelService {
    @Override
    public int save(HotelDTO hotelDTO) throws SaveFailException {
        return 0;
    }

    @Override
    public void update(HotelDTO hotelDTO) throws UpdateFailException {

    }

    @Override
    public void delete(int id) throws DeleteFailException, NotFoundException {

    }

    @Override
    public HotelDTO search(int id) throws NotFoundException {
        return null;
    }

    @Override
    public List<HotelDTO> findByStarRate(int id) throws NotFoundException {
        return null;
    }
}
