package HW_3.HW_3_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();

        if (a>10){
            System.out.println("больше 10");
        }if (a<100){
            System.out.println("меньше 100");
        }if (a/2>20){
            System.out.println("результат деления на 2 больше 20");
        }if (a>= 5 && a <= 40){
            System.out.println("значение переменной между 5 и 40 включительно");
        }else{
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}
