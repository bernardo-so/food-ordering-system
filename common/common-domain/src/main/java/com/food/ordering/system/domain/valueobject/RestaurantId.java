package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class RestaurantId extends BaseID<UUID> {
    public RestaurantId(UUID value) {
        super(value);
    }
}
