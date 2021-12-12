package uz.apelsin.apelsin.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.apelsin.apelsin.entity.Category;

import java.io.File;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Integer id;

    private String name;

    private String description;

    private double price;

    private File photo;

    private Integer categoryId;

    private Category category;

}
