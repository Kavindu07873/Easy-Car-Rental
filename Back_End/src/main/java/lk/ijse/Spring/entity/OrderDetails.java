package lk.ijse.Spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@IdClass(OrderItem_PK.class)
public class OrderDetails {
    @Id
    private String oid;
    @Id
    private String carId;
    private String CarType;
    private String Version;
    private String Need;
    private String Total;


    @ManyToOne
    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "carId",referencedColumnName = "carId",insertable = false,updatable = false)
    private Car car;
}
