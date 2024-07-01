package org.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Demo extends DemoParent implements DemoInterface {
    public String fallbackBySuper(String name, Throwable e) {
        return "bySuper:fallback";
    }

    public String fallbackByInterface(String name, Throwable e) {
        return "byInterface:fallback";
    }
}
