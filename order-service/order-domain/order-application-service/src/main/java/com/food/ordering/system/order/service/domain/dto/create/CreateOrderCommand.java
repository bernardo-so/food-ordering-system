package com.food.ordering.system.order.service.domain.dto.create;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record CreateOrderCommand(
        @NotNull UUID customerId,
        @NotNull UUID restaurantId,
        @NotNull @Positive BigDecimal price,
        @NotNull List<OrderItem> items,
        @NotNull OrderAdress adress
) {}
