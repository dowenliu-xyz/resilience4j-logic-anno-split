package org.example.demo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

public interface DemoInterface {
    @CircuitBreaker(name = "demo", fallbackMethod = "fallbackByInterface")
    default String greeting(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("name should not be null or blank");
        }
        return "Interface:Hello, " + name + "!";
    }
}
