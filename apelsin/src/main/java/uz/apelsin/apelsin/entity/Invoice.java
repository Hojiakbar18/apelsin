package uz.apelsin.apelsin.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer amount;

    private Date issued;

    private Date due;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    Orders orders;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "invoice",cascade = CascadeType.ALL)
    private List<Payment> payments;

}
