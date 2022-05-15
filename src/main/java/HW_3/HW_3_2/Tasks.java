package HW_3.HW_3_2;
import static java.lang.Math.*;

public class Tasks {
    public static void main(String[] args) {
//        for(int i = 0; i <=15; i++){
//            System.out.println(i);
//        }
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println();
        double number = 5;
        for (double a = 0; a <100; a++){
            double numberToPower = Math.pow(number,a);
            if (numberToPower<10000){
                int value = (int)a;
                System.out.println(value);
            }else{
                break;
            }
        }

        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println();
//
//        for (int i = 40; i<61; i++){
//            if(i%4==0){
//                System.out.println(i);
//            }
//        }
//        System.out.println();
//        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
//        System.out.println();
//
//        int a = 40;
//        while((a<61)){
//            while (a%4==0){
//                System.out.println(a);
//                break;
//            }
//            a++;
//        }


    }
}
