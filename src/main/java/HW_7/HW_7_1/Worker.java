package HW_7.HW_7_1;

public class Worker extends Employee{

    public Worker(double baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    public final double getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }
}
