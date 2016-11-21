package com.numalab.java.mysample;

import java.text.*;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) throws Exception {

    }

    private static Stream<Integer> readSizeAndArrayAsStream() {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        return IntStream.range(0, size)
                .mapToObj(i -> in.nextInt());
    }

}
