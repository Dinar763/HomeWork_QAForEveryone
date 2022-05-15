package HW_7.HW_7_1;

public abstract class BaseManager extends Worker{
    private int numberOfSubordinates;
    private static final int SALARY_COEF = 3;

    public BaseManager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if(getNumberOfSubordinates()>0){
            return ((getBaseSalary()*getNumberOfSubordinates())/100.0*SALARY_COEF);
        }else{
            return getBaseSalary();
        }

    }
}
