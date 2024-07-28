package lk.ijse.gdse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO {
    private int id;
    private String name;
    private String contact;
    private String nic;
    private String remarks;
    private byte[] licenseImageFront;
    private byte[] licenseImageRear;
}
