package lk.ijse.gdse.aad.api;

import lk.ijse.gdse.aad.dto.UserDTO;
import lk.ijse.gdse.aad.dto.sec.ErrorRes;
import lk.ijse.gdse.aad.dto.sec.LoginReq;
import lk.ijse.gdse.aad.dto.sec.LoginRes;
import lk.ijse.gdse.aad.exception.CreateFailException;
import lk.ijse.gdse.aad.exception.UserNotFoundException;
import lk.ijse.gdse.aad.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserApi {
    @Autowired
    UserService userService;
    @PostMapping()
    public ResponseEntity login(@RequestBody LoginReq loginReq) {
        try {
            UserDTO user = userService.searchUserByEmail(loginReq.getEmail());
            String email = user.getEmail();
            LoginRes loginRes = new LoginRes(email);
            return ResponseEntity.ok(loginRes);
        } catch (UserNotFoundException e) {
            ErrorRes errorResponse = new ErrorRes(HttpStatus.BAD_REQUEST, "Invalid username or password");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        } catch (Exception e) {
            ErrorRes errorResponse = new ErrorRes(HttpStatus.BAD_REQUEST, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    @PostMapping(value = "/{id:\\d+}", consumes = "multipart/form-data")
    public ResponseEntity<UserDTO> save(@RequestPart(value = "profilePic") byte[] profilePic,
                                        @RequestPart(value = "userName")String userName,
                                        @RequestPart(value = "password") String password,
                                        @RequestPart(value = "contact") String contact,
                                        @RequestPart(value = "email") String email,
                                        @RequestPart(value = "birthday") String birthday,
                                        @RequestPart(value = "nicFront") byte[] nicFront,
                                        @RequestPart(value = "nicRear") byte[] nicRear,
                                        @RequestPart(value = "gender") String gender,
                                        @RequestPart(value = "nicNo") String nicNo
    ){
        System.out.println(nicNo);
        System.out.println(nicFront);
        try {
            UserDTO userDTO = new UserDTO();
            userDTO.setUsername(userName);
            userDTO.setPassword(password);
            userDTO.setContact(contact);
            userDTO.setEmail(email);
            userDTO.setUsernic(nicNo);
            userDTO.setBirthday(LocalDate.parse(birthday));
            userDTO.setGender(gender);
            userDTO.setNicFrontByte(nicFront);
            userDTO.setNicRearByte(nicRear);
            userDTO.setProfilePicByte(profilePic);


            int id = userService.addUsers(userDTO);
            userDTO.setId(id);
            return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
        } catch (CreateFailException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
