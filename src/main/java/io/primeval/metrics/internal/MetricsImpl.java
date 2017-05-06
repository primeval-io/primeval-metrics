package io.primeval.metrics.internal;

import java.util.Map;

import org.osgi.service.component.annotations.Component;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;

import io.primeval.metrics.Metrics;

@Component
public final class MetricsImpl implements Metrics {

    private final MetricRegistry metricRegistry = new MetricRegistry();

    @Override
    public Map<String, Metric> getMetrics() {
        return metricRegistry.getMetrics();
    }

    @Override
    public Counter counter(String name) {
        return metricRegistry.counter(name);
    }

    @Override
    public Timer timer(String name) {
        return metricRegistry.timer(name);
    }

    @Override
    public Meter meter(String name) {
        return metricRegistry.meter(name);
    }
}
