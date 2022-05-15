package HW_2;

public class HW_2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        String answerFirstNumber = a % 2 == 0 ? (a + " " + "Число четное") : (a + " " +  "Число нечетное");
        String answerSecondNumber = b % 2 == 0 ? (b + " " + "Число четное") : (b + " " + "Число нечетное");
        System.out.println(answerFirstNumber);
        System.out.println(answerSecondNumber);
        for(int j = 0; j<20; j++){
            System.out.print('☺');
        }


    }
}
