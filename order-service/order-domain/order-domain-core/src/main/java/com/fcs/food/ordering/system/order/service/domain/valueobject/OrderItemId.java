package com.fcs.food.ordering.system.order.service.domain.valueobject;

import com.fcs.food.ordering.system.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
