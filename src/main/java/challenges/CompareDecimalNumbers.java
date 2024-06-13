package challenges;


public class CompareDecimalNumbers extends BaseClass {
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){

        long number1 = (int) (d1*1000);
        logger.debug(number1);
        long number2 = (int) (d2*1000);
        logger.debug(number2);
        return (number1 == number2);
    }
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
        System.out.println(areEqualByThreeDecimalPlaces(-3.176,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.174));
        System.out.println(areEqualByThreeDecimalPlaces(0,0));
    }
}
