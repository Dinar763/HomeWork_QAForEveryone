package HW_4.HW_4_2;

public class Task3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        int index = s.toLowerCase().indexOf("рит");
        while (index != -1){
            System.out.println(index);
            index = s.toLowerCase().indexOf("рит", index+1);
        }

    }
}
