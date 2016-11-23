package com.numalab.java.mysample;

import com.numalab.java.mysample.algorithms.*;

import java.text.*;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) throws Exception {

    }

    private static LongStream readLongArrayAsStream(int size) {
        Scanner in = new Scanner(System.in);
        return LongStream.range(0, size)
                .map(i -> in.nextLong());
    }

    private static IntStream readSizeAndArrayAsStream() {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        return IntStream.range(0, size)
                .map(i -> in.nextInt());
    }

}
