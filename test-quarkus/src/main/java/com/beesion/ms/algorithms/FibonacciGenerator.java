package com.beesion.ms.algorithms;


import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class FibonacciGenerator {

    public List<Integer> generate(int[] signature, int n) {
        List<Integer> sequence = new ArrayList<>();
        if (n == 0) return sequence;

        for (int i = 0; i < Math.min(signature.length, n); i++) {
            sequence.add(signature[i]);
        }

        for (int i = sequence.size(); i < n; i++) {
            int next = sequence.get(i-1) + sequence.get(i-2);
            sequence.add(next);
        }

        return sequence;
    }
}