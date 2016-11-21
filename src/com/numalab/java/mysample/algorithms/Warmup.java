package com.numalab.java.mysample.algorithms;

import java.text.*;
import java.util.*;
import java.util.stream.*;

public class Warmup {
}

class CirculerArrayRotation {
    public static void solve() throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[(((m - k) % n) + n) % n]);
        }
    }
}

class TimeConversion {
    public static void solve() throws Exception {
        Scanner in = new Scanner(System.in);
        String dateStr = in.nextLine();
        SimpleDateFormat sdfIn = new SimpleDateFormat("hh:mm:ssa", Locale.US);
        Date date = sdfIn.parse(dateStr);
        SimpleDateFormat sdfOut = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdfOut.format(date));
    }
}

class Staircase {
    public static void solve() throws Exception {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(((i + j + 1) < size)
                        ? ' '
                        : '#');
            }
            System.out.println();
        }
    }
}

class CompareTheTriplets {
    public static void solve() {
        Scanner in = new Scanner(System.in);
        Rating aliceRating = new Rating();
        Rating bobRating = new Rating();

        aliceRating.readData(in);
        bobRating.readData(in);

        compareRating(aliceRating, bobRating);

        System.out.println(aliceRating.score + " " + bobRating.score);
    }

    private static void compareRating(Rating r1, Rating r2)
    {
        for (int i = 0; i < r1.dataArray.length; i++) {
            if (r1.dataArray[i] > r2.dataArray[i]) {
                r1.score++;
            } else if (r1.dataArray[i] < r2.dataArray[i]) {
                r2.score++;
            }
        }
    }

    static class Rating {
        private static final int COUNT = 3;
        public int[] dataArray = new int[COUNT];
        public int score;

        public void readData(Scanner sc) {
            for (int i = 0; i < COUNT; i++) {
                dataArray[i] = sc.nextInt();
            }
        }
    }
}

class DiagonalDifference {
    public static void solve() {
        Scanner in = new Scanner(System.in);
        int size;
        size = in.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int[] row = readRow(in, size);
            sum += row[i] - row[size - i - 1];
        }
        System.out.println(Math.abs(sum));
    }

    private static int[] readRow(Scanner sc, int count) {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = sc.nextInt();
        }
        return result;
    }
}

class SimpleArraySum {
    public static void solve() {
        Optional<Integer> sum = readSizeAndArrayAsStream().reduce((s, i) -> s + i);
        System.out.println(sum.orElse(0));
    }

    private static Stream<Integer> readSizeAndArrayAsStream() {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        return IntStream.range(0, size)
                .mapToObj(i -> in.nextInt());
    }
}
