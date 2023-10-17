package com.example.Collections2;

import java.util.*;

public class Service {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> evenNumbersSet = new HashSet<>();

        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println("Задание 2");

        for (int num : nums) {
            if (num % 2 == 0) {
                evenNumbersSet.add(num);
            }
        }
        List<Integer> evenNumbersList = new ArrayList<>(evenNumbersSet);
        evenNumbersList.sort(Integer::compareTo);

        for (Integer evenNumber : evenNumbersList) {
            System.out.println(evenNumber);
        }

        System.out.println("Задание 3");

        List<String> words = new ArrayList<>(List.of("cat", "dog", "zebra", "giraffe", "zebra"));

        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }

        System.out.println("Задание 4");

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> countMap = new HashMap<>();

        for (String word : strings) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
