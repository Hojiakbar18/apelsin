package uz.apelsin.apelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.apelsin.apelsin.entity.Orders;

import java.sql.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Integer> {


    List<Orders> getAllByDetailNotNullAndDateBefore(Date date);

}
