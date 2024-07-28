package lk.ijse.gdse.aad.service.impl;

import lk.ijse.gdse.aad.dto.UserDTO;
import lk.ijse.gdse.aad.entity.User;
import lk.ijse.gdse.aad.exception.CreateFailException;
import lk.ijse.gdse.aad.exception.DeleteFailException;
import lk.ijse.gdse.aad.exception.UpdateFailException;
import lk.ijse.gdse.aad.exception.UserNotFoundException;
import lk.ijse.gdse.aad.repo.UserRepo;
import lk.ijse.gdse.aad.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public UserDTO searchUserByEmail(String email) throws UserNotFoundException {
        User user = userRepo.findByEmail(email);
        System.out.println(user);
        List<String> roles = new ArrayList<>();
        roles.add("user");
        UserDTO userDetails = modelMapper.map(user, UserDTO.class);
        return userDetails;
    }

    @Override
    public void updateUser(UserDTO email) throws UpdateFailException {

    }

    @Override
    public int addUsers(UserDTO email) throws CreateFailException {
        return 0;
    }

    @Override
    public void deleteUser(String email) throws DeleteFailException {

    }

    @Override
    public List<UserDTO> getAll(String email) throws UserNotFoundException {
        return null;
    }
}
