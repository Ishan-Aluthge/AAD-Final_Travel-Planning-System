package lk.ijse.gdse.aad.service.impl;

import lk.ijse.gdse.aad.dto.GuideDTO;
import lk.ijse.gdse.aad.exception.DeleteFailException;
import lk.ijse.gdse.aad.exception.SaveFailException;
import lk.ijse.gdse.aad.exception.SearchFailException;
import lk.ijse.gdse.aad.exception.UpdateFailException;
import lk.ijse.gdse.aad.service.GuideService;

public class GuideServiceImpl implements GuideService {

    @Override
    public int saveGuide(GuideDTO guideDTO) throws SaveFailException {
        return 0;
    }

    @Override
    public void updateGuide(GuideDTO guideDTO) throws UpdateFailException {

    }

    @Override
    public void deleteGuide(int id) throws DeleteFailException {

    }

    @Override
    public GuideDTO getGuide(int id) throws SearchFailException {
        return null;
    }
}
