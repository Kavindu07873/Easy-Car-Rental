//package lk.ijse.Spring.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//import javax.persistence.*;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//
//@ToString
//@IdClass(rentDetails_PK.class)
//@Entity
//public class rentDetails {
//    @Id
//    private String oid;
//    private String carId;
//    private String CarType;
//    private String Version;
//    private String Need;
//    private String Total;
//
//
//    @ManyToOne
//    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
//    private rent rent;
//}
