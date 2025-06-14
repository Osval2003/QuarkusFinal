package com.beesion.ms.test.algorithmst;

import com.beesion.ms.algorithms.FibonacciGenerator;
import jakarta.inject.Inject;
import java.util.List;


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