/*
COUNT EVEN NUMBER 

GIVEN A INT NUMBER PRINT THE NUMBER OF EVEN DIGITS IF IT IS GREATER THAN 3 OTHER THAN PRINT " IT IS NOT A VALID NUMBER "

INPUT 1.----> 4536782

OUTPUT 1.----> 4


INPUT 2---> 1365279

OUTPUT 2 --> IT IS NOT A VALID NUMBER

*/
import java.util.*;
public class Count_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        int b;
        while (num>0){
            b = num%10;
            num = num/10;
            if (b%2==0){
                count++;
            }
        }
    if (count>=3){
        System.out.println(count);
    } else { System.out.println("it is not valid");}
        
    }

}