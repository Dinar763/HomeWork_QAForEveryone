package HW_8.HW_8_1;

public class ArrayPlusArray {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int total = 0;
        for (int i: arr1){
            total += i;
        }
        for (int k: arr2){
            total += k;
        }
        return total;
    }

//    public static void main(String[] args) {
//        int j = arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6});
//        System.out.println(j);
//    }


}
