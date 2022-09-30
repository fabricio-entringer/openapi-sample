package dev.entringer.openapisample.model;

import java.math.BigDecimal;

public record Order(int id, Product product, Customer customer, int amount, BigDecimal total) {

}
