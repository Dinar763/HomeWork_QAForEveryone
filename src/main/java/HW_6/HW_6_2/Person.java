package HW_6.HW_6_2;

public class Person {
    String name;
    int age;
    char sex;



    String getName(){
        if (sex == 'M'){
            return ("Mr. " + name);
        }else{
            return ("Mrs. " + name);
        }
    }
}
