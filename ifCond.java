/*
Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  5to 20 , print Not Weird
If  is even and in the inclusive range of 20 to 50 , print Weird
If  is even and greater than 50, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format
A single line containing a positive integer, .

Constraints
Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
*/

import java.util.*;

public class ifCond {
    public static void main(String[] arg){
    Scanner sc= new Scanner(System.in);
    int num =sc.nextInt();

    System.out.println("enter the number:");
    if (num % 2 !=0){
        System.out.println("Weird");
    }
    else{
        if ( num>=5 && num<=20){
            System.out.println("not weird");
        }
        else if (num>=20 && num<=50){
            System.out.println("weird");
        }
        else if (num>50){
            System.out.println("not weird");
        }
        else {
            System.out.println("weird");
        }
    }
}
}

