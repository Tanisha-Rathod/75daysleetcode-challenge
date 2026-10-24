
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(calcDays(date1) - calcDays(date2));
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 &&
               (year % 100 != 0 || year % 400 == 0);
    }

    private int calcDays(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int total = 0;

        // Count complete years
        for (int y = 1971; y < year; y++) {
            total += isLeapYear(y) ? 366 : 365;
        }

        // Days in each month
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (isLeapYear(year)) {
            days[1] = 29;
        }

        // Count complete months of the current year
        for (int m = 0; m < month - 1; m++) {
            total += days[m];
        }

        // Count days elapsed in the current month
        total += day;

        return total;
    }
}
