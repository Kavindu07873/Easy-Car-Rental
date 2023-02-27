package lk.ijse.Spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Car {

    @Id
    private   String carId;
    private   String Version;
    private String Type;
    private String Fuel;
    private String Passengers;
    private String Transmission;
    private String Colour;
    private String Rent_duration;
    private String Amount;
    private String Price;
    private String Price_ExtraKm;



}
