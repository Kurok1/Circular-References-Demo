package com.example.demo;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:maimengzzz@gmail.com">韩超</a>
 * @since 1.0.0
 */
@Service
public class DemoService implements MeterBinder {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void bindTo(MeterRegistry registry) {

    }
}
