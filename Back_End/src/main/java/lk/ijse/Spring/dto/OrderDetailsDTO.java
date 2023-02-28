package lk.ijse.Spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OrderDetailsDTO {

//    private String oid;
    private String cId;
    private String scheduleId;
    private String Type;
    private String Version;
    private int Need;
    private double Total;
}
