package uz.apelsin.apelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.apelsin.apelsin.entity.Detail;

public interface DetailRepository extends JpaRepository<Detail, Integer> {

    Detail getDetailByOrdersId(Integer id);
}
