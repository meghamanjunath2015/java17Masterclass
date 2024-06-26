package challenges.ControlFlow;

import challenges.BaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Prime number must be divisible by 1 and itself
public class isPrimeNumber extends BaseClass {
    public static boolean isPrimeNumber(int number){
        //Prime number has to be a natural number - that means number should be greater than 1
        if(number <=1){
            return false;
        }
        /*The factors of 36 are pairs of numbers that multiply to give 36:
        //1 * 36 = 36
        //2 * 18 = 36
        //3 * 12 = 36
        //4 * 9 = 36
        //6 × 6 = 36
        // Notice that square root of 36 is 6
        To check if 36 is a prime number, we need to determine if there are any divisors of 36 other than 1 and 36. Instead of checking all numbers from 2 to 35, we can limit our checks to the numbers from 2 to 6 (i.e., up to square root of 36)
        This is because if 36 can be divided by any number greater than 6, it must also be divisible by a corresponding number smaller than 6.*/
        for(int i=2; i<Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void getFirstNPrimeNumber(int total){
        List<Integer> primeNumberList = new ArrayList<>();
        int count = 0;
        int number = 2; // Starting from the first prime number
        while(count < total){
            if(isPrimeNumber(number)){
                primeNumberList.add(number);
                count++;
            }
            number++;
        }
        System.out.println(primeNumberList);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers to find: ");
        int userInput = scanner.nextInt();
        getFirstNPrimeNumber(userInput);
        System.out.println(isPrimeNumber(6));
        System.out.println(isPrimeNumber(1));
        System.out.println(isPrimeNumber(7));
        System.out.println(isPrimeNumber(15));
        System.out.println(isPrimeNumber(11));
        getFirstNPrimeNumber(6);
        getFirstNPrimeNumber(2);
        getFirstNPrimeNumber(10);
        getFirstNPrimeNumber(10);
    }
}
