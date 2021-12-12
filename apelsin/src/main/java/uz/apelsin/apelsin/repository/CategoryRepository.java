package uz.apelsin.apelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.apelsin.apelsin.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
