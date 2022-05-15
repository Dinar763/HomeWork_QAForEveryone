package HW_3.HW_3_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        String sumOfVariablesIsEven = ((a+b)%2 == 0) ? "maybe a and b are even" : "some variable is odd" ;
        System.out.println(sumOfVariablesIsEven);
    }
}
