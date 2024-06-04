package challenges;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class compareDecimalNumbers {
    protected static final Logger logger = LogManager.getLogger();
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){

        long number1 = (int) (d1*1000);
        logger.info(number1);
        long number2 = (int) (d2*1000);
        logger.info(number2);
        return (number1 == number2) ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
        System.out.println(areEqualByThreeDecimalPlaces(-3.176,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.174));
        System.out.println(areEqualByThreeDecimalPlaces(0,0));
    }
}
