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
    private  String OId;
    private  String DrId;
    private  String DriverName;
    private LocalDate date;
}
