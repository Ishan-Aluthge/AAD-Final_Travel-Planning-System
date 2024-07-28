package lk.ijse.gdse.aad.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ErrorRes {
    HttpStatus httpStatus;
    String message;

}