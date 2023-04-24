package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class OrderId extends BaseID<UUID>{
    public OrderId(UUID value) {
        super(value);
    }
}
