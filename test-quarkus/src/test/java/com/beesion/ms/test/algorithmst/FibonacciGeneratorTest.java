package com.beesion.ms.test.algorithmst;

import com.beesion.ms.algorithms.FibonacciGenerator;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


@QuarkusTest
public class FibonacciGeneratorTest {

    @Inject
    FibonacciGenerator generator;

    @Test
    public void testBaseCase() {
        List<Integer> result = generator.generate(new int[]{0, 1}, 9);
        assertEquals(List.of(0, 1, 1, 2, 3, 5, 8, 13, 21), result);
    }
}