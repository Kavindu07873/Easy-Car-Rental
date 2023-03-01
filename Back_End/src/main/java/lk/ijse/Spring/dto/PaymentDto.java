package lk.ijse.Spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class PaymentDto {
    private String User;
    private String Type;
    private String Version;
    private String RentFree;
    private String TravelDistance;
    private String LossDamage;
    private String ExtraKmPrice;

}
