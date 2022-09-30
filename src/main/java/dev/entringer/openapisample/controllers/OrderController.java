package dev.entringer.openapisample.controllers;

import dev.entringer.openapisample.model.Customer;
import dev.entringer.openapisample.model.Order;
import dev.entringer.openapisample.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.IntStream;

@RestController("/orders")
public class OrderController {

    @GetMapping
    public List<Order> findAll() {
        return IntStream.range(1, 20)
                .mapToObj(index ->
                        new Order(index,
                                new Product(index, "Product " + index),
                                new Customer(index, "Customer " + index),
                                100-index,
                                BigDecimal.valueOf(Math.random()).setScale(2, RoundingMode.DOWN)))
                .toList();
    }

}
