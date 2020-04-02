package user.infrastructure;

import user.domain.DomainEvent;
import user.domain.EventBus;

import java.util.List;

public class ReactorEventBus implements EventBus {

    @Override
    public void publish(final List<DomainEvent> events) {
    }
}
