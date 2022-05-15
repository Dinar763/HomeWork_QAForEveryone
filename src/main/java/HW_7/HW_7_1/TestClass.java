package HW_7.HW_7_1;


import static HW_7.HW_7_1.EmployeeUtills.*;

public class TestClass {
    public static void main(String[] args) {
        Manager manager1 = new Manager(100000,"Jon", 30);
        Manager manager2 = new Manager(120000, "Fred", 35);
        Manager manager3 = new Manager(130000,"Harold",120);
        Manager[] managerArray = {manager1, manager2, manager3};


        System.out.println(getMaxNumberOfSubordinates(managerArray));
        System.out.println(getMinNumberOfSubordinates(managerArray));

    }
}
