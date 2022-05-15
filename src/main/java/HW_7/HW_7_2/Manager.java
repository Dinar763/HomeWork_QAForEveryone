package HW_7.HW_7_2;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, double salaryPerDay, int numberOfSubordinates) {
        super(name, age, gender, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double sumSalary = 0;
        if(getNumberOfSubordinates()>0){
            for (int i = 0; i < monthArray.length; i++) {
                sumSalary += (monthArray[i].getNumberWorkingDays()*getSalaryPerDay()) + (monthArray[i].getNumberWorkingDays()*getSalaryPerDay() * getNumberOfSubordinates()*0.01);
            }
        }else{
            for (int i = 0; i < monthArray.length; i++) {
                sumSalary += monthArray[i].getNumberWorkingDays() * getSalaryPerDay();
            }
        }

        return  sumSalary;
    }
}
