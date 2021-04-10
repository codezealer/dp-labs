package com.codezealer;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;


@Log4j2
public class MainTest {


    @Test
    public void testMain() {
        System.out.println("hello");
        log.info("test log.");
    }
}
