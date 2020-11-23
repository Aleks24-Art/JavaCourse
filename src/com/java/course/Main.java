package com.java.course;


import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    // Встречаем одинаковый код больше 1 раза = отдельный метод
    // Пишем комментарии как для себя, так и для следующих поколений
    // Только понятные названия переменных и методов(функций) !!!
    // import - берём сторонний функционал

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        String inputString = scanner.nextLine();

        System.out.println("Pow = " + pow(inputInt, 2));
        System.out.println("Abs = " + abs(inputInt));
        System.out.println("Sqrt = " + sqrt(inputInt));

        //sum(5, 10);
        //sum(10, 10);

    }

    // Считаем сумму
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    /*
    * sdas
    * asdsa
    * asd
    * */
    public static int minus(int a, int b) {
        return a - b;
    }

    // TODO дописать умножение
    public static void prod(int a, int b) {
        System.out.println();
    }

    /**
     * Some description
     * @param a Some var description
     * @param b Some var description
     */
    public static void del(int a, int b) {
        System.out.println(a / b);
    }
}