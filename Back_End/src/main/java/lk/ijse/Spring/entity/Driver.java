package lk.ijse.Spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

@Entity
public class Driver{


//    private  String DrId;
    private String Name;
    private String LicNo;
    private  String Address;
    private String Availability;
    @Id
    private String user;
}
