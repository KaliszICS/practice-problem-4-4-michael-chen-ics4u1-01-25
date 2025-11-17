public class CampbellClass {
    /**
     * Class that does some conversions
     * @author Michael Chen
     * @version 1.0.0
     */

    /**
     * Private constructor
     */
    private CampbellClass() {

    }

    /**
     * Convert int to String
     * @param a Integer to convert
     * @return Converted String
     */
    public static String convertString(int a) {
        return Integer.toString(a);
    }

     /**
     * Convert double to String
     * @param a Double to convert
     * @return Converted String
     */
    public static String convertString(double a) {
        return Double.toString(a);
    }

     /**
     * Convert char to String
     * @param a Character to convert
     * @return Converted String
     */
    public static String convertString(char a) {
        return Character.toString(a);
    }

     /**
     * Convert bool to String
     * @param a Boolean to convert
     * @return Converted String
     */
    public static String convertString(boolean a) {
        return Boolean.toString(a);
    }

    /**
     * Convert meters as int to centimeters as int
     * @param a Meters as int
     * @return Centimeters as int
     */
    public static int convertMetersToCenti(int a) {
        return a * 100;
    }

    /**
     * Convert meters as double to centimeters as double
     * @param a Meters as int
     * @return Centimeters as double
     */
    public static double convertMetersToCenti(double a) {
        return a * 100;
    }

    /**
     * Replaces all non-alpha characters in a String
     * @param a String to replace
     * @return String with all non-alpha characters replaced 
     */
    public static String removeNonAlpha(String a) {
        return a.replaceAll("[^a-zA-Z]", "");
    }

    /**
     * Replaces all non-alpha characters in a String; capitalizes if b is true and all lowercase if b is false
     * @param a String to replace
     * @return String with all non-alpha characters replaced; capitalizes if b is true and all lowercase if b is false
     */
    public static String removeNonAlpha(String a, boolean b) {
        if (b) {
            return a.replaceAll("[^a-zA-Z]", "").toUpperCase();
        }
        return a.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }
}
