package lk.ijse.gdse.aad.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*@AllArgsConstructor*/
@NoArgsConstructor
@Data
@ToString
public class LoginRes {
    private String email;
    private String token;

    public LoginRes(String email, String token) {
        this.email = email;
        this.token = token;
    }
}