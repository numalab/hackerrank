package com.numalab.java.mysample.algorithms;

import java.text.*;
import java.util.*;
import java.util.stream.*;

public class Imprementation {

    public static class MiniMaxSum {
        public static void main(String[] args) throws Exception {
            long[] array = readLongArrayAsStream(5).toArray();
            Long max = LongStream.of(array).max().orElse(1);
            Long min = LongStream.of(array).min().orElse(1);
            Long sum = LongStream.of(array).sum();

            System.out.println((sum - max) + " " + (sum - min));
        }

        private static LongStream readLongArrayAsStream(int size) {
            Scanner in = new Scanner(System.in);
            return LongStream.range(0, size)
                    .map(i -> in.nextLong());
        }
    }

}
