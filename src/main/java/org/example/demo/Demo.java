package org.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Demo extends DemoParent implements DemoInterface {
    public String fallbackBySuper(String name, Throwable e) {
        log.info("stack: ", e);
        return "bySuper:fallback";
    }

    public String fallbackByInterface(String name, Throwable e) {
        log.info("stack: ", e);
        return "byInterface:fallback";
    }
}
