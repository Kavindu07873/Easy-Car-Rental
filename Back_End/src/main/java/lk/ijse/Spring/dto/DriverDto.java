package lk.ijse.Spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class DriverDto {

    private String Name;
    private String LicNo;
    private  String Address;
    private String Availability;
    private String user;


}
