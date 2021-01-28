package tw.idv.angus.digDig;

import org.greenrobot.eventbus.EventBus;
import tw.idv.angus.digDig.vo.DigEvent;

import java.util.stream.IntStream;

public class Miner {
    private final EventBus eventBus;

    public Miner(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void dig() {
        IntStream.range(0, 10).forEach(index -> {
            if (0 == index % 9) {
                eventBus.post(new DigEvent("got a Stone"));
            }
            if (8 == index % 9) {
                eventBus.post(new DigEvent("got a Jewel"));
            }
        });
    }
}
