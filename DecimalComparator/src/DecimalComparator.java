public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double no,double No)
    {
        if((int) (no*1000)==(int) (No*1000)) {
            return true;
        }
        else {
            return false;
        }
    }
}
