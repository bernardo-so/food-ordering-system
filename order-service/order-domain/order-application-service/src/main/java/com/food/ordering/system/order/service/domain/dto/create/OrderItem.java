package com.food.ordering.system.order.service.domain.dto.create;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.UUID;
public record OrderItem(
        @NotNull UUID productId,
        @NotNull Integer quantity,
        @NotNull @Positive BigDecimal price,
        @NotNull @Positive BigDecimal subTotal
) {}
