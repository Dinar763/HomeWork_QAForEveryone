package HW_5.HW_5_2;

public class Tasks {
    public static void main(String[] args) {
        //Task 1
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        //task 3
        int count = 9;
        for (int k = 0; k <= 10 ; k++) {
            for (int i = 1; i <= k; i++) {
                System.out.print("  ");
            }
            for (int i = count; i >= 0 ; i--) {
                System.out.print(i + " ");
            }
            for (int j = 1; j <= count ; j++) {
                System.out.print(j + " ");
            }
            count--;
            System.out.println();
        }


        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        //Task 2
        String s = "";
        for (int i = 10; i >= 0; i--) {
            System.out.print(s);
            for (int j = 0; j < i; j++) {
                System.out.print(" " + j );
            }
            s += "  ";
            System.out.println();
        }
    }
}
