package com.food.ordering.system.order.service.domain.dto.message;

import com.food.ordering.system.domain.valueobject.PaymentStatus;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public record PaymentResponse(
        @NotNull String id,
        @NotNull String sagaId,
        @NotNull String orderId,
        @NotNull String paymentId,
        @NotNull String customerId,
        @NotNull @Positive BigDecimal price,
        @NotNull Instant createdAt,
        @NotNull PaymentStatus paymentStatus,
        @NotNull List<String> failureMessages
) {}
