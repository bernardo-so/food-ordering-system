package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BaseID;

import java.util.UUID;

public class TrackingId extends BaseID<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
