package challenges.ControlFlow;

import challenges.BaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sum3And5 extends BaseClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a total number to print out all numbers until that number which can be divided by both 3 and 5:");
        int userInput = scanner.nextInt();
        calculateSum(userInput);
    }

    public static void calculateSum(int number){
        List<Integer> sumList = new ArrayList<>();
        int totalSum = 0;
        for(int i=0; i<number; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sumList.add(i);
                totalSum = totalSum + i;
            }
        }
        System.out.println(totalSum);
        System.out.println(sumList);
    }

}
