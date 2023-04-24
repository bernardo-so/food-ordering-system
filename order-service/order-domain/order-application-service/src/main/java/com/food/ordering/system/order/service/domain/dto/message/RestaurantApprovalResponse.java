package com.food.ordering.system.order.service.domain.dto.message;

import com.food.ordering.system.domain.valueobject.OrderApprovalStatus;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.List;

public record RestaurantApprovalResponse(
        @NotNull String id,
        @NotNull String sagaId,
        @NotNull String orderId,
        @NotNull String restaurantId,
        @NotNull Instant createdAt,
        @NotNull OrderApprovalStatus orderApprovalStatus,
        @NotNull List<String> failureMessages
) {}
