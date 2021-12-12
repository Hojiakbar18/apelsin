package uz.apelsin.apelsin.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.apelsin.apelsin.entity.Invoice;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private Integer invoiceId;

    private double amount;

    private Invoice invoice;
    private Date time;

}
