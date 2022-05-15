package HW_7.HW_7_2;

public class MainTest {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Dinar", 35, 'M', 1000, 10);
        Month[] months = {
                new Month("March",31,22),
                new Month("April",30,21)
        };
        System.out.println(manager1.getSalary(months));
    }
}
