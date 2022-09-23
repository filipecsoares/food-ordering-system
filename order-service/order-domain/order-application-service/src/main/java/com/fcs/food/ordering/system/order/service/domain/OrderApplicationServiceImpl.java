package com.fcs.food.ordering.system.order.service.domain;

import com.fcs.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.fcs.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import com.fcs.food.ordering.system.order.service.domain.dto.track.TrackOrderQuery;
import com.fcs.food.ordering.system.order.service.domain.dto.track.TrackOrderResponse;
import com.fcs.food.ordering.system.order.service.domain.ports.input.service.OrderApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
class OrderApplicationServiceImpl implements OrderApplicationService {

    private final OrderCreateCommandHandler orderCreateCommandHandler;
    private final OrderTrackCommandHandler orderTrackCommandHandler;

    public OrderApplicationServiceImpl(OrderCreateCommandHandler orderCreateCommandHandler, OrderTrackCommandHandler orderTrackCommandHandler) {
        this.orderCreateCommandHandler = orderCreateCommandHandler;
        this.orderTrackCommandHandler = orderTrackCommandHandler;
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderCommand command) {
        return orderCreateCommandHandler.createOrder(command);
    }

    @Override
    public TrackOrderResponse trackOrder(TrackOrderQuery trackOrderQuery) {
        return orderTrackCommandHandler.trackOrder(trackOrderQuery);
    }
}
