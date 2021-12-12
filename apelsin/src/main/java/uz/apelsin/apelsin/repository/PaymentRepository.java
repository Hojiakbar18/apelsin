package uz.apelsin.apelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.apelsin.apelsin.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
