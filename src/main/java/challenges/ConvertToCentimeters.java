package challenges;

/*
1 inch - 2.54cm
1 foot = 12 inches
 */
public class ConvertToCentimeters extends BaseClass {
    public static void main(String[] args) {
        int feet1 = 5;
        int feet2 = 68;

        System.out.println(feet1 + "ft, 8 in= " + convertToCentimeters(feet1, feet1) +  "cm");
        System.out.println(feet2 + "ft, 8 in= " + convertToCentimeters(feet2) + "cm");
    }

    private static double convertToCentimeters(int inches) {
            return inches * 2.54;
    }

    private  static  double convertToCentimeters(int feet, int centimeters){
        int feetToInches = feet * 12;
        double inchesToCm = convertToCentimeters(feetToInches);
        logger.info("convert feet to inches to cm {}", inchesToCm);
        double totalCm = inchesToCm + centimeters;
        logger.info("now add remaining cm {}", totalCm);
        return totalCm;
    }
}
