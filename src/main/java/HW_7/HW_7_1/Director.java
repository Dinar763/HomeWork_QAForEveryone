package HW_7.HW_7_1;

public class Director extends BaseManager{

    private static final int SALARY_COEF = 9;

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
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
