package tw.idv.angus.digDig.Listener;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import tw.idv.angus.digDig.vo.DigEvent;

public class DigListener {
    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void gotATreasure(DigEvent event) {
        System.out.println("find a :" + event.getTreasure());
    }
}
