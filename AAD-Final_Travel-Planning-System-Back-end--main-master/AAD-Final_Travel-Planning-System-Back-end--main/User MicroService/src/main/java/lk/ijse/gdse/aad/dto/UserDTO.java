package lk.ijse.gdse.aad.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;

@AllArgsConstructor
@Data
public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String usernic;
    private String contact;
    private String email;
    private LocalDate birthday;
    private ArrayList<String> roles;
    private String gender;
    private String remarks;

    private byte []profilePicByte;
    private byte[] nicFrontByte;
    private byte[] nicRearByte;

    public UserDTO(){
        roles = new ArrayList<>();
        roles.add("user");
    }

}
