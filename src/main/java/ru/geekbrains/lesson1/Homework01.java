package ru.geekbrains.lesson1;

public class Homework01 {
    private static String calculate;


    public static void main(String[] args) {
        int varOne = 1;
        int varTwo = 2;
        int varThree = 3;
        int varFour = 4;

        System.out.println("Результат задания 1: " + calculate(varOne, varTwo, varThree, varFour));

        System.out.println("Результат задания 2: " + checkNumbers(1, 15));
    }

    private static float calculate(int a, int b, int c, int d) {
      return a * (b + (c * 1.0f / d));
    }
    private static boolean checkNumbers(int first, int second) {
        int sum = first + second;
        return (sum <=20) && (sum >=10);
    }
    private static boolean isPositive(int variable) {
        return variable >= 0;
    }



}

