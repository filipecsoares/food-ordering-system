package com.fcs.food.ordering.system.order.service.domain.ports.input.service;

import com.fcs.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.fcs.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import com.fcs.food.ordering.system.order.service.domain.dto.track.TrackOrderQuery;
import com.fcs.food.ordering.system.order.service.domain.dto.track.TrackOrderResponse;

import javax.validation.Valid;

public interface OrderApplicationService {
    CreateOrderResponse createOrder(@Valid CreateOrderCommand command);
    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
