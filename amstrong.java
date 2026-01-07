// To find if a number is amstrong or not
/*
  eg: 153= 1**3 + 5**3 + 3**3
 */


/*
import java.util.*;
public class amstrong {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String num= sc.nextLine();
        int sum=0;
        for (int i=0; i<num.length();i++){
            sum+=Math.pow((Integer.parseInt(String.valueOf(num.charAt(i)))),3);
        }
        if (sum==Integer.parseInt(num)){
            System.out.println("The number is amstrong");
        }else{
            System.out.println("The number is not amstrong");
        }       
        }

    }
*/

import java.util.*;

public class amstrong{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String num= sc.nextLine();
		int sum=0;
		int length=num.length();
		for (int i=0; i<length; i++){
			sum+=Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),length);
		}
		if (sum== Integer.parseInt(num)){
			System.out.println("The number is amstrong");
		} else {
			System.out.println("The number is not amstrong");
		}}}