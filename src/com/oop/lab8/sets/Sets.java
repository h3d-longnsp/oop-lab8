package com.oop.lab8.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        firstSet.add(44);
        firstSet.add(33);
        firstSet.add(22);
        firstSet.add(11);

        secondSet.add(55);
        secondSet.add(44);
        secondSet.add(60);
        secondSet.add(33);

        // manual
        Set<Integer> intersect1 = intersectionManual(firstSet, secondSet);
        System.out.println(intersect1);
        Set<Integer> union1 = unionManual(firstSet, secondSet);
        System.out.println(union1);

        // library methods
        Set<Integer> intersect2 = intersection(firstSet, secondSet);
        System.out.println(intersect2);
        Set<Integer> union2 = union(firstSet, secondSet);
        System.out.println(union2);

    }

    // Return the intersection of two given sets without using library functions
    public static Set<Integer> intersectionManual(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> intersection = new HashSet<>();

        // Iterate through the elements of the first set
        for (Integer element : firstSet) {
            // Check if the element exists in the second set
            if (secondSet.contains(element)) {
                // If it does, add it to the intersection set
                intersection.add(element);
            }
        }

        return intersection;
    }

    public static Set<Integer> intersection(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);

        return intersection;
    }

    // Return the union of two given sets without using library functions
    public static Set<Integer> unionManual(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> union = new HashSet<>();

        for (Integer element : firstSet) {
            union.add(element);
        }

        for (Integer element : secondSet) {
            union.add(element);
        }

        return union;
    }

    public static Set<Integer> union(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> union = new HashSet<>(firstSet);
        union.addAll(secondSet);

        return union;
    }
}
