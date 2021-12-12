package uz.apelsin.apelsin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.apelsin.apelsin.payload.OrderDto;
import uz.apelsin.apelsin.payload.Response;
import uz.apelsin.apelsin.service.OrdersService;

@RestController
@RequestMapping("/api/order/")
public class OrderController {

    @Autowired
    OrdersService ordersService;

    @PostMapping("/save")
    public HttpEntity<?> save(@RequestBody OrderDto dto){
        Response save = ordersService.save(dto);
        return ResponseEntity.ok(save);
    }

    @GetMapping("{orderId}")
    public HttpEntity<?> getOne(@PathVariable Integer orderId){
        return ResponseEntity.ok(ordersService.getOrderById(orderId));
    }


}
