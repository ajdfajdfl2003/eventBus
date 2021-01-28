package tw.idv.angus.digDigFunctional.Listener;

import tw.idv.angus.digDigFunctional.vo.DigEvent;

import java.util.function.Consumer;

public class DigListener implements Consumer<DigEvent> {
    @Override
    public void accept(DigEvent event) {
        System.out.println("find a :" + event.getTreasure());
    }
}
