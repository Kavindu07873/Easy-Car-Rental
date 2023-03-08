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
public class Finalizedto {
    private String oid;
    private   String customerId;
    private String driId;
    private String date;
    private LocalDate receiveDate;
    private int totalAll;
}
