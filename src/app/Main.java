package app;

import java.util.Scanner;

public class Main {

    private static final double CONV = 1.609344;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double kilometers;
        double miles;

        System.out.print("***Конвертер миль*** \nВведіть кількість миль: ");
        miles = scanner.nextDouble();

        kilometers = miles * CONV;

        System.out.println("В " + miles + " милі(-ях) " + kilometers + " кілометрів.");
    }
}