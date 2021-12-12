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
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "orders",cascade = CascadeType.ALL)
    private List<Detail> detail;
}
