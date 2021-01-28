package tw.idv.angus.digDig.Listener;

import org.greenrobot.eventbus.Subscribe;
import tw.idv.angus.digDig.vo.DigEvent;

public class DigListener {
    @Subscribe
    public void gotATreasure(DigEvent event) {
        System.out.println("find a :" + event.getTreasure());
    }
}
