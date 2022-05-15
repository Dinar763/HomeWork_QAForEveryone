package HW_3.HW_3_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        if (a>b){
            System.out.println("a > b");
        }else if (a<b){
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        scanner.close();
    }
}
