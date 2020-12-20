package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        int varOne = 1;
        int varTwo = 2;
        int varThree = 3;
        int varFour = 4;

            System.out.println("Результат задания 1: " + calculate(varOne, varTwo, varThree, varFour));
    }
        private static float calculate(int a, int b, int c, int d) {
            return a * (b + (c * 1.0f / d));
        }
}
