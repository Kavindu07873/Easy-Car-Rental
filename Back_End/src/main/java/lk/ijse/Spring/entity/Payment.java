package lk.ijse.Spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Payment {

    @Id
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

   // @GeneratedValue(strategy=GenerationType.AUTO)
   // private int id;
