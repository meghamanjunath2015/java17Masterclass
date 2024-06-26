package challenges.ControlFlow;

import challenges.BaseClass;

public class EqualSumChecker extends BaseClass {

    public  static boolean equalSumChecker(int a, int b, int c){
        if (a + b == c) {
            logger.info("a + b == c");
            return true;
        }
        if (a + c == b) {
            logger.info("a + c == b");
            return  true;
        }
        if (b + c == a) {
            logger.info("b + c == a");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(equalSumChecker(2, 1, 1));
        System.out.println(equalSumChecker(4, 5, 9));
        System.out.println(equalSumChecker(6, 10, 4));
        System.out.println(equalSumChecker(8, -10, -4));
    }
}
