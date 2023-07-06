package ru.netology.stats;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] year = new int[12];
        System.out.println(Arrays.toString(year));
        year[3] = 28;
        System.out.println(Arrays.toString(year));
    }
}