package lk.ijse.Spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

@Entity
public class DriverDetails {

//    private String num;
    @Id
    private  String oid;
    private  String user;
    private  String name;
    private LocalDate date;

}
