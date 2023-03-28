package seminar1.task;

import java.util.Scanner;

import seminar1.task.Task2;

/**
 * task2
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
    
}
