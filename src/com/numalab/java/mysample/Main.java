package com.numalab.java.mysample;

import java.text.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String dateStr = in.nextLine();
        SimpleDateFormat sdfIn = new SimpleDateFormat("hh:mm:ssa", Locale.US);
        Date date = sdfIn.parse(dateStr);
        SimpleDateFormat sdfOut = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdfOut.format(date));
    }
}
