package tw.idv.angus;

import lombok.Getter;
import org.greenrobot.eventbus.Subscribe;

@Getter
public class EventListener {
    private int eventsHandled;

    @Subscribe
    public void stringEvent(String event) {
        eventsHandled++;
    }
}
