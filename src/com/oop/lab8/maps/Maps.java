package com.oop.lab8.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static final Map<Integer, String> COLORS_MAP = new HashMap<Integer, String>() {{
        put(0, "black");
        put(1, "white");
        put(2, "red");
    }};

    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 11);
        map1.put(2, 22);
        map1.put(3, 33);
        map1.put(4, 40);
        map1.put(5, 56);

        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(0, 9);
        map2.put(2, 7);
        map2.put(4, 5);
        map2.put(6, 3);

        System.out.println(map1);
        System.out.println("Count: " + count(map1));

        System.out.println(map2);
        empty(map2);
        System.out.println(map2);

        System.out.println(containsKey(map1, 4));
        System.out.println(containsKey(map1, 6));

        System.out.println(containsKeyValue(map1, 0, 11));
        System.out.println(containsKeyValue(map1, 1, 10));
        System.out.println(containsKeyValue(map1, 1, 11));

        Set<Integer> keySet = keySet(map1);
        System.out.println(keySet);

        Collection<Integer> valueSet = values(map1);
        System.out.println(valueSet);

        System.out.println(getColor(2));
        System.out.println(getColor(1));
        System.out.println(getColor(3));
        System.out.println(getColor(0));
    }

    // function to return the number of key-value mappings of a map
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    // function to remove all mappings
    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean containsKey(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        if (map.containsKey(key)) {
            int storedValue = map.get(key);
            return storedValue == value;
        }

        return false;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        return COLORS_MAP.get(value);
    }
}
