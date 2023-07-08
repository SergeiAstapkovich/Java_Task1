/**
 * task1
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
 */
package Dz;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        System.out.printf("Факториал: %d\n", giveMeFactorial(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int giveMeFactorial ( int b ) {
        int i = 1;
        while (b > 0){
        i = b * i;
        b = b - 1;
        }
        return i;
    }
}
