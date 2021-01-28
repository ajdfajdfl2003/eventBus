package tw.idv.angus;

import org.greenrobot.eventbus.EventBus;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventListenerTest {

    @Test
    public void name() {
        EventBus eventBus = EventBus.builder().build();
        EventListener listener = new EventListener();
        eventBus.register(listener);

        eventBus.post("String Event");
        assertEquals(1, listener.getEventsHandled());

        eventBus.post("String Event");
        assertEquals(2, listener.getEventsHandled());
    }
}