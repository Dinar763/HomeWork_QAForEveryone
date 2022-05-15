package HW_6.HW_6_2;

public class TestClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.person.name="Dinar";
        employee1.person.age=33;
        employee1.person.sex='M';
        employee1.salary = 1000;

        Employee employee2 = new Employee();
        employee2.person.name="Dinar";
        employee2.person.age=37;
        employee2.person.sex='F';
        employee2.salary = 2002;

        Salary salary = new Salary();
        Employee[] array = {employee1, employee2};
        System.out.println(salary.getSum(array));

    }
}
