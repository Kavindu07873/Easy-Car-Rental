//package lk.ijse.Spring.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.util.List;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//public class rent {
//    @Id
//    String oid;
//
//    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
//    @JoinColumn(name = "customerID", referencedColumnName = "Id", nullable = false)
//    Customer cusID;
//
//    LocalDate date;
//
//    @OneToMany(mappedBy = "rent", cascade = CascadeType.ALL)
//    List<rentDetails> rentDetails;
//}
