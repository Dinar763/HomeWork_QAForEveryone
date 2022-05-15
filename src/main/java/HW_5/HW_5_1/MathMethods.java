package HW_5.HW_5_1;

public class MathMethods {
    public static int getSum(int a, int b){
        return a+b;
    }
    public static int getSub(int a, int b){
        return a-b;
    }
    public static int getMultip(int a, int b){
        return a*b;
    }
    public static int getDiv(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println(getSum(2,4));
        System.out.println(getSub(10,4));
        System.out.println(getMultip(20,4));
        System.out.println(getDiv(40,10));
    }
}
