package lk.ijse.Spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CarDto {
    private   String carId;
    private   String Version;
    private String Type;
    private String Fuel;
    private String Passengers;
    private String Transmission;
    private String Colour;
    private String Rent_duration;
    private int Amount;
    private String Price;
    private String Price_ExtraKm;

}