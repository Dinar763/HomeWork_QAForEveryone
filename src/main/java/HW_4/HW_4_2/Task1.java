package HW_4.HW_4_2;

public class Task1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        char[] chars = s.toLowerCase().toCharArray();
        String temp = "";
        for(char a:chars){
            if (a=='о'){
                temp += a;
            }
        }
        System.out.println(temp);
    }
}
