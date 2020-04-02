package user.domain;

import java.util.LinkedList;
import java.util.List;

public class AggregateRoot {
    private List<DomainEvent> recordedDomainEvents = new LinkedList<>();

    final public List<DomainEvent> pullDomainEvents() {
        final List<DomainEvent> recordedDomainEvents = this.recordedDomainEvents;
        this.recordedDomainEvents = new LinkedList<>();

        return recordedDomainEvents;
    }

    final protected void storeEvent(DomainEvent event) {
        recordedDomainEvents.add(event);
    }
}
