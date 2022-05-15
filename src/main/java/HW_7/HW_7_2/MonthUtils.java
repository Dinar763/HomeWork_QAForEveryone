package HW_7.HW_7_2;

public class MonthUtils {

    Month January = new Month("January", 31, 16);
    Month February = new Month("February",28,19);
    Month March = new Month("March",31,22);
    Month April = new Month("April",30,21);
    Month May = new Month("May",31,18);
    Month June = new Month("June",30,21);
    Month July = new Month("July",31,21);
    Month August = new Month("August",31,23);
    Month September = new Month("September",30,22);
    Month October = new Month("October",31,21);
    Month November = new Month("November",30,21 );
    Month December = new Month("December",31,22);

    private static Month[] MONTH_ARRAY = {
            new Month("January", 31, 16),
            new Month("February",28,19),
            new Month("March",31,22),
            new Month("April",30,21),
            new Month("May",31,18),
            new Month("June",30,21),
            new Month("July",31,21),
            new Month("August", 31, 23),
            new Month("September",30,22),
            new Month("October",31,21),
            new Month("November",30,21 ),
            new Month("December",31,22)
    };

    public static Month[] getMonthArray(){
        return MONTH_ARRAY;
    }
}
