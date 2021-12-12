package uz.apelsin.apelsin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.apelsin.apelsin.entity.Invoice;

import java.sql.Date;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {

    List<Invoice> getAllByDueAfter(Date due);

    List<Invoice> getAllByIssuedBefore(Date issued);


}
