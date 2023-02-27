package lk.ijse.Spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class PaymentDto {
    private String User;
    private String RentFree;
    private String DriverFree;
    private String TravelDistance;
    private String LossDamage;
    private String calcLossDamage;
    private String PaymentDate;
    private String ExtraKm;
    private String ExtraKmPrice;
    private String FullPayment;
}
