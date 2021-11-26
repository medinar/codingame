package com.medinar.practice.codingame;

import java.util.*;
import java.util.stream.Collectors;

public class TheDescent {

    public static void main(String args[]) {

//        int[] heights = new int[] {3,8,7,9,5,6,4,2};
//        int[] heights = new int[]{0, 6, 7, 5, 0, 8, 1, 0};
        int[] heights = new int[]{0, 2, 4, 3, 0, 0, 0, 0};

        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < heights.length; index++) {
            map.put(index, heights[index]);
        }

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
