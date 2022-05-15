package HW_7.HW_7_2;

public class Month {
    private final String name;
    private final int numberDays;
    private final int numberWorkingDays;

    public Month(String name, int numberDays, int numberWorkingDays) {
        this.name = name;
        this.numberDays = numberDays;
        this.numberWorkingDays = numberWorkingDays;
    }

    public String getName() {
        return name;
    }

    public int getNumberDays() {
        return numberDays;
    }

    public int getNumberWorkingDays() {
        return numberWorkingDays;
    }
}
