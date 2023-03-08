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
public class Finalize {

    @Id
    private String oid;
    private   String customerId;
    private String driId;
    private String date;
    private LocalDate receiveDate;
    private int totalAll;

}
