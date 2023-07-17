package DecisionMaking;

import java.time.DayOfWeek;

public class test3 {
    public static void main(String[] args) {

    }

    private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
        int Sunday = 0;
        switch (otherDay) {
        default:
        case 1:
            continue;
        case thursday:
            return DayOfWeek.THURSDAY;
        case 2, 10:
            break;
        case Sunday:
            return DayOfWeek.SUNDAY;
        case 3:
            return DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;

    }
}
