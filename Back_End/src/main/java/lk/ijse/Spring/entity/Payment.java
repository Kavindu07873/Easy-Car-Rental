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
    private String Type;
    private String Version;
    private String RentFree;
    private String TravelDistance;
    private String LossDamage;
    private String ExtraKmPrice;

}

   // @GeneratedValue(strategy=GenerationType.AUTO)
   // private int id;
