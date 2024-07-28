package lk.ijse.gdse.aad.service;

import lk.ijse.gdse.aad.dto.GuideDTO;
import lk.ijse.gdse.aad.exception.DeleteFailException;
import lk.ijse.gdse.aad.exception.SaveFailException;
import lk.ijse.gdse.aad.exception.SearchFailException;
import lk.ijse.gdse.aad.exception.UpdateFailException;

public interface GuideService {
    int saveGuide(GuideDTO guideDTO) throws SaveFailException;
    void updateGuide(GuideDTO guideDTO) throws UpdateFailException;
    void deleteGuide(int id) throws DeleteFailException;
    GuideDTO getGuide(int id) throws SearchFailException;
}
