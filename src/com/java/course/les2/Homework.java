package com.java.course.les2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Реверс имени
        System.out.println("Введите имя: ");
        System.out.println(revers(scanner.nextLine()));

        // Вводим и сравниваем возраст по группам
        System.out.println("Введите возраст: ");
        compareAge(scanner.nextInt());

        // Нахождение мин и макс числа
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++)
            nums[i] = scanner.nextInt();

        System.out.println("Min = " + min(nums));
        System.out.println("Max = " + max(nums));
    }

    private static String revers(String name) {
        return new StringBuilder(name).reverse().toString();
    }

    static void compareAge(int age) {
        if (age < 0) {
            System.out.println("Не бывает");
        } else if (age < 18) {
            System.out.println("Уроки");
        } else {
            System.out.println("Клубника");
        }
    }

    protected static int min(int[] nums) {
        return Arrays.stream(nums).summaryStatistics().getMin();
    }

    protected static int max(int[] nums) {
        return Arrays.stream(nums).summaryStatistics().getMax();
    }

}
