package tw.idv.angus.digDigFunctional;

import org.junit.Test;
import tw.idv.angus.digDigFunctional.Listener.DigListener;

public class MinerTest {
    @Test
    public void dig() {
        Miner miner = new Miner(new DigListener());
        miner.dig();
    }
}