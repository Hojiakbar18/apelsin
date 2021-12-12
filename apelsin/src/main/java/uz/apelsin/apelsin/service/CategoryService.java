package uz.apelsin.apelsin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.apelsin.apelsin.entity.Category;
import uz.apelsin.apelsin.entity.Product;
import uz.apelsin.apelsin.payload.ApiResponse;
import uz.apelsin.apelsin.payload.CategoryDto;
import uz.apelsin.apelsin.repository.CategoryRepository;
import uz.apelsin.apelsin.repository.ProductRepository;


import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    public ApiResponse saveOrEdit(CategoryDto dto) {
        Category category = new Category();
        try {
            if (dto.getId() != null) {
                category = categoryRepository.getById(dto.getId());
            }
            category.setName(dto.getName());

            categoryRepository.save(category);
            return new ApiResponse(dto.getId() != null ? "edited" : "saved", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponse("error", false);
    }

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public CategoryDto getCategoryByProductId(Integer productId) {
        Product product = productRepository.getById(productId);
        return getCategoryDto(product.getCategory());
    }

    public CategoryDto getCategoryDto(Category category) {
        CategoryDto dto = new CategoryDto();
        dto.setName(category.getName());
        dto.setId(category.getId());
        return dto;
    }

}
