package com.oop.lab8.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        // Insert elements into the list
        insertFirst(myList, 10);
        insertLast(myList, 20);
        insertLast(myList, 30);
        insertLast(myList, 40);
        insertLast(myList, 50);
        insertLast(myList, 666);
        insertFirst(myList, 60);

        // Display the list
        System.out.println("Initial list: " + myList);

        replace(myList, 35);
        System.out.println("List after replacement: " + myList);

        removeThird(myList);
        System.out.println("List after removal: " + myList);

        removeEvil(myList);
        System.out.println("List after removal: " + myList);

        List<Integer> squareList = generateSquare();
        System.out.println("Square list: " + squareList);

        System.out.println(contains(myList, 42));
        System.out.println(contains(squareList, 81));

        LinkedList<Integer> newList = new LinkedList<>();
        System.out.println("New list before copy: " + newList);
        copy(squareList, newList);
        System.out.println("New list after copy: " + newList);

        insertBeginningEnd(newList, 90);
        System.out.println(newList);
    }
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    // replace 3rd element
    public static void replace(List<Integer> list, int value) {
        if (list.size() >= 3) {
            list.set(2, value);
        }
    }

    // remove 3rd element
    public static void removeThird(List<Integer> list) {
        if (list.size() >= 3) {
            list.remove(3);
        }
    }

    // remove the element 666 if contains
    public static void removeEvil(List<Integer> list) {
        list.removeIf(item -> item == 666);
    }

    // generate first 10 square number
    public static List<Integer> generateSquare() {
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            squares.add(i * i);
        }
        return squares;
    }

    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        target.clear();
        target.addAll(source);
    }

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    // without using library functions
    public static void reverseManual(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            // Swap elements at 'left' and 'right'
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    // insert an element both at the beginning and end of the same LinkedList
    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);  // Insert at the beginning
        list.addLast(value);   // Insert at the end
    }
}
