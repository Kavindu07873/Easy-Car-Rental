package lk.ijse.Spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class DriverDetailsDto {
//    private String num;
    private  String oid;
    private  String user;
    private  String name;
    private LocalDate date;
}
