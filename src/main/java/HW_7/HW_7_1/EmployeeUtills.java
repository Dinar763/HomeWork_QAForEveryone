package HW_7.HW_7_1;
public class EmployeeUtills {

    //поиск сотрудника в массиве по его имени
    public static Worker findWorkerByName(Worker[] workers, String name){
        for (int i = 0; i < workers.length; i++) {
            if (name.equals(workers[i].getName())){
                return workers[i];
            }
        }
        return null;
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Worker findWorkerBySubName(Worker[] workers, String subName){
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(subName)){
                return workers[i];
            }
        }
        return null;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double getSalarySum(Worker[] workers){
        double sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        return sum;
    }

    //поиск наименьшей зарплаты в массиве
    public static double getSalaryMin(Worker[] workers){
        double min = workers[0].getSalary();
        for (int i = 1; i < workers.length; i++) {
            if (workers[i].getSalary()<min){
                min = workers[i].getSalary();
            }
        }
        return min;
    }

    //поиск наибольшей зарплаты в массиве
    public static double getSalaryMax(Worker[] workers){
        double max = workers[0].getSalary();
        for (int i = 1; i < workers.length; i++) {
            if (workers[i].getSalary()>max){
                max = workers[i].getSalary();
            }
        }
        return max;
    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int getMaxNumberOfSubordinates (Manager[] managers){
        int maxNumberOfSubordinates = managers[0].getNumberOfSubordinates();
        for (int i = 1; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates()>maxNumberOfSubordinates){
                maxNumberOfSubordinates = managers[i].getNumberOfSubordinates();
            }
        }
        return maxNumberOfSubordinates;
    }

    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int getMinNumberOfSubordinates (Manager[] managers){
        int minNumberOfSubordinates = managers[0].getNumberOfSubordinates();
        for (int i = 1; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() < minNumberOfSubordinates){
                minNumberOfSubordinates = managers[i].getNumberOfSubordinates();
            }
        }
        return minNumberOfSubordinates;
    }

    //поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public static double getMaxDifSalary (Manager[] managers){
        double maxDifSalary = managers[0].getSalary()-managers[0].getBaseSalary();
        for (int i = 1; i < managers.length; i++) {
            if (managers[i].getSalary()-managers[i].getBaseSalary() > maxDifSalary){
                maxDifSalary = managers[i].getSalary()-managers[i].getBaseSalary();
            }
        }
        return maxDifSalary;
    }


    //поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
    public static double getMinDifSalary (Manager[] managers){
        double minDifSalary = managers[0].getSalary()-managers[0].getBaseSalary();
        for (int i = 1; i < managers.length; i++) {
            if (managers[i].getSalary()-managers[i].getBaseSalary() <minDifSalary){
                minDifSalary = managers[i].getSalary()-managers[i].getBaseSalary();
            }
        }
        return minDifSalary;
    }


}
