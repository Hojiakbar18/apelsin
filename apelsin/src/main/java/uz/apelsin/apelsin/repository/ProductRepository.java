package uz.apelsin.apelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.apelsin.apelsin.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
