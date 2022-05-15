package HW_4.HW_4_1;

public class AllTasks {
    public static void main(String[] args) {
        //Задача 1
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println();
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int total = 0;
        for (int i = 0; i < array1.length; i++) {
            total += array1[i];
        }
        System.out.println("Сумма всех значений массива равна: " + total);
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println();
        //Задача 2
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int maxValue = -2147483648 ;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i]>maxValue) {
                maxValue = array2[i];
            }
        }
        System.out.println("Максимальное значение массива: " + maxValue);
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println();
        //Задача 3
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int minValue = 2147483647 ;
        for (int i = 0; i < array3.length; i++) {
            if (array2[i]<minValue) {
                minValue = array2[i];
            }

        }
        System.out.println("Минимальное значение массива: " + minValue);
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println();
        //Задача 4
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int total4 = 0;
        for (int i = 0; i < array4.length; i++) {
            total4 += array4[i];
        }
        System.out.println("Cреднее арифметическое всех значений массива: " + (total4/array4.length));
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println();
        //Задача 5
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                sum += array5[i][j];
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println();
        //Задача 6
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 10, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int maxValueArray6 = -2147483648;
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (array6[i][j]>maxValueArray6){
                    maxValueArray6 = array6[i][j];
                };
            }
        }
        System.out.println("Максимальное значение массива: " + maxValueArray6);
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println();
        // Задача 7
        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int counter = 0;
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                counter += 1;
            }
        }
        System.out.println("Количество элементов в массиве: " + counter );
    }
}
