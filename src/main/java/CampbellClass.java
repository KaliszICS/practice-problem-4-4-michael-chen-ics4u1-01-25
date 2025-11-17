public class CampbellClass {
    /**
     * Class that does some conversions
     * @author Michael Chen
     * @version 1.0.0
     */

    private CampbellClass() {

    }

    public static String convertString(int a) {
        return Integer.toString(a);
    }

    public static String convertString(double a) {
        return Integer.toString(a);
    }

    public static String convertString(char a) {
        return Integer.toString(a);
    }

    public static String convertString(boolean a) {
        return a.toString();
    }
}
