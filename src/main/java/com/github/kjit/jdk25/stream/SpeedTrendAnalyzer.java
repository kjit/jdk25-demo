package com.github.kjit.jdk25.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Gatherer;

public class SpeedTrendAnalyzer implements Gatherer<Vehicle, List<Integer>, List<Integer>> {

    @Override
    public Supplier<List<Integer>> initializer() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Integer>, Downstream<? super List<Integer>>> finisher() {
        return (list, lastValue) -> lastValue.push(list);
    }

    @Override
    public Integrator<List<Integer>, Vehicle, List<Integer>> integrator() {
        return (aggregator, value, _) -> {
            if (aggregator.isEmpty()) {
                aggregator.add(value.getMaxSpeed());
            } else {
                aggregator.add(value.getMaxSpeed() - aggregator.getLast());
            }
            return true;
        };
    }
}
