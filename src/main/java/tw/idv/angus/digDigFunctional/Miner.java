package tw.idv.angus.digDigFunctional;

import tw.idv.angus.digDigFunctional.vo.DigEvent;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Miner {
    private final Consumer<DigEvent> consumer;

    public Miner(Consumer<DigEvent> consumer) {
        this.consumer = consumer;
    }

    public void dig() {
        IntStream.range(0, 10).forEach(index -> {
            if (0 == index % 9) {
                consumer.accept(new DigEvent("got a Stone"));
            }
            if (8 == index % 9) {
                consumer.accept(new DigEvent("got a Jewel"));
            }
        });
    }
}
