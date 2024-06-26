package challenges.ControlFlow;

public class LeapYear {

    //Assumption - year should be between 1 & 9999
    //
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2050));
        System.out.println(isLeapYear(1000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(800));
    }
}
