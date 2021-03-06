package uz.apelsin.apelsin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.apelsin.apelsin.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public HttpEntity<?> getAll(){
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/{productId}")
    public HttpEntity<?> getProductById(@PathVariable Integer productId){
        return ResponseEntity.ok(productService.getById(productId));
    }


}
