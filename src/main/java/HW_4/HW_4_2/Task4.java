package HW_4.HW_4_2;

public class Task4 {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"},{"Java"}};
        int countNotContainLetter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].contains("е")){
                    continue;
                }else{
                    countNotContainLetter += 1;
                }
            }
        }
        System.out.println(countNotContainLetter);

    }
}
