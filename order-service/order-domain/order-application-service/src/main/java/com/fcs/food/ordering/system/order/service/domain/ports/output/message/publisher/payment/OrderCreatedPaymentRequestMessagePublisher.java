package com.fcs.food.ordering.system.order.service.domain.ports.output.message.publisher.payment;

import com.fcs.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.fcs.food.ordering.system.order.service.domain.event.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
