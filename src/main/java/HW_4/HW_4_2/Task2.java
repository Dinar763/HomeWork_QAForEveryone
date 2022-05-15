package HW_4.HW_4_2;

public class Task2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        char[] chars = s.toCharArray();
        int counter = 0;
        for(char a:chars){
            if (a=='е'){
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}
