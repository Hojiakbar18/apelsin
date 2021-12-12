package uz.apelsin.apelsin.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int quantity;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    Product product;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    Orders orders;

}
