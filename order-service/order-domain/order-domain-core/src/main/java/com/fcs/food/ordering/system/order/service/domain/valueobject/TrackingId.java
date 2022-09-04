package com.fcs.food.ordering.system.order.service.domain.valueobject;

import com.fcs.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
