public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;

        }
    }

}
