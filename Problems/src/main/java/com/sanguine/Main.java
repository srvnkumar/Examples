package com.sanguine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*    preferences = {
                0: [0, 1, 3, 6],
        1: [1, 4, 7],
        2: [2, 4, 7, 5],
        3: [3, 2, 5],
        4: [5, 8]*/
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list1 = List.of(0, 1, 3, 6);
        List<Integer> list2 = List.of(1, 4, 7);
        List<Integer> list3 = List.of(2, 4, 7, 5);
        List<Integer> list4 = List.of(3, 2, 5);
        List<Integer> list5 = List.of(5, 8);
        map.put(0, list1);
        map.put(1, list2);
        map.put(2, list3);
        map.put(3, list4);
        map.put(4, list5);
    }
}