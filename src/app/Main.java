package app;

import java.util.Scanner;

public class Main {

    private static final double CONV = 1.609344;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double kilometers;
        double miles;
        int choice;

        System.out.println("\n***Конвертер миль/кілометрів***");
        System.out.print("\n1. Конвертація миль в кілометри;\n2. Конвертація кілометрів в милі." +
                "\nОберіть функцію (1,2): ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("\n***Конвертація миль в кілометри***\nВведіть кількіть миль: ");
            miles = scanner.nextDouble();
            kilometers = convMilesToKilometers(miles);
            System.out.printf("В %s милі(-ях) ~%.2f кілометрів.", miles, kilometers);
        } else if (choice == 2) {
            System.out.print("\n***Конвертація кілометрів в милі***\nВведіть кількіть кілометрів: ");
            kilometers = scanner.nextDouble();
            miles = convKilometersToMiles(kilometers);
            System.out.printf("В %s кілометрі(-ах) ~%.2f миль.", kilometers, miles);
        } else {
            System.out.print("\nОбрано невірний варіант. Спробуйте ще раз ;)");
        }
    }

    private static double convMilesToKilometers(double miles) {
        return miles * Main.CONV;
    }

    private static double convKilometersToMiles(double meters) {
        return meters / Main.CONV;
    }
}