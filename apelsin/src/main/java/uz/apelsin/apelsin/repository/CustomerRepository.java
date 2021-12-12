package uz.apelsin.apelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.apelsin.apelsin.entity.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
