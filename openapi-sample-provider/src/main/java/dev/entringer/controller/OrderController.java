package dev.entringer.controller;

import dev.entringer.model.Customer;
import dev.entringer.model.Order;
import dev.entringer.model.Product;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.IntStream;

@RestController("/orders")
public class OrderController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Find all Orders",
                description = "This service returns all Orders stored in the database.",
                operationId = "findAllOrders",
                tags = {"Order"},
            responses = {@ApiResponse(responseCode = "200",
                                        description = "Order found successful.",
                                        content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                                        array = @ArraySchema(schema = @Schema(implementation = Order.class)))),
                    @ApiResponse(responseCode = "204", description = "No data found.", content = @Content(schema = @Schema(implementation = Void.class)))})
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

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Find One Order",
            description = "This service returns one Order stored in the database that matches with the id informed by the parameter.",
            operationId = "findOrder",
            tags = {"Order"},
            //requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "No body is required or allowed."),
            parameters = @Parameter(name = "id", description = "Order Unique Identification", example = "1"),
            responses = {@ApiResponse(responseCode = "200", description = "Order found successful."),
                         @ApiResponse(responseCode = "404", description = "Order not found.", content = @Content(schema = @Schema(implementation = Void.class)))})
    public Order findOrder(@PathVariable final Integer id) {
        return new Order(id, new Product(id, "Product " + id), new Customer(id, "Customer " + id), 10, BigDecimal.valueOf(20.18));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Insert New Order",
            description = "This service inserts a new Order and return its values after stored in the database.",
            operationId = "insertOrder",
            tags = {"Order"},
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(content = @Content(schema = @Schema(implementation = Order.class)),
                                                                                description = "Order to be persisted."),
            responses = {@ApiResponse(responseCode = "201", description = "Order Created.",
                                        content = @Content(schema = @Schema(implementation = Order.class))),
                    @ApiResponse(responseCode = "400", description = "Bad Request.", content = @Content)})
    public Order insertOrder(@RequestBody final Order order) {
        return new Order(5, order.product(), order.customer(), order.amount(), order.total());
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @Operation(summary = "Edit Order",
            description = "This service edits an existing Order and return its values after stored in the database.",
            operationId = "editOrder",
            tags = {"Order"},
            responses = {@ApiResponse(responseCode = "202", description = "Edition accepted."),
                    @ApiResponse(responseCode = "400", description = "Bad Request.", content = @Content(schema = @Schema(implementation = Void.class)))})
    public Order editOrder(@PathVariable final Integer id, @RequestBody Order order) {
        return new Order(id, order.product(), order.customer(), order.amount(), order.total());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @Operation(summary = "Delete Order",
            description = "This service deletes an existing Order stored in the database.",
            operationId = "deleteOrder",
            tags = {"Order"},
            responses = {@ApiResponse(responseCode = "202", description = "Deletion accepted."),
                    @ApiResponse(responseCode = "400", description = "Bad Request.")})
    public void deleteOrder(@PathVariable @NonNull final Integer id) {
        // Delete order code.
    }



}
