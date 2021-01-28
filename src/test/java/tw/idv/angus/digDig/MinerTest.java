package tw.idv.angus.digDig;

import org.greenrobot.eventbus.EventBus;
import org.junit.Test;
import tw.idv.angus.digDig.Listener.DigListener;

public class MinerTest {
    @Test
    public void dig() {
        EventBus eventBus = EventBus.getDefault();
        eventBus.register(new DigListener());
        Miner miner = new Miner(eventBus);
        miner.dig();
    }
}