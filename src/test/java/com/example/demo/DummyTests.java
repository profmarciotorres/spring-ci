package com.example.demo;

import java.util.logging.Logger;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DummyTests {

    static Logger logger = Logger.getLogger(DummyTests.class.getName());

    @Test
    void contextLoads() {
        logger.info("Context loads test executed");
    }

    @Test
    void testSum() {
        Assertions.assertEquals(2, Calc.sub(1, 1));;
    }

    @Test
    void testSub() {
        Assertions.assertEquals(2, Calc.sub(3, 1));;
    }
}