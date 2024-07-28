package lk.ijse.gdse.aad.service;


import lk.ijse.gdse.aad.dto.UserDTO;
import lk.ijse.gdse.aad.exception.CreateFailException;
import lk.ijse.gdse.aad.exception.DeleteFailException;
import lk.ijse.gdse.aad.exception.UpdateFailException;
import lk.ijse.gdse.aad.exception.UserNotFoundException;

import java.util.List;

public interface UserService {
    UserDTO searchUserByEmail(String email) throws UserNotFoundException;
    void updateUser(UserDTO email) throws UpdateFailException;
    int addUsers(UserDTO email) throws CreateFailException;
    void deleteUser(String email) throws DeleteFailException;
    List<UserDTO> getAll(String email) throws UserNotFoundException;
}
