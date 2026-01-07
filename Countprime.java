/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.*;
public class Countprime {
    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    String di= sc.nextLine();
    int count=0;

    for (int i=0; i < di.length();i++){
        int num=Integer.parseInt(String.valueOf(di.charAt(i)));
        if (num>1){
            boolean is_prime=true;
            for (int j=2; j<=Math.sqrt(num);j++){
                if (num%j==0){
                    is_prime=false;
                    break;
                }
                
                }
                if (is_prime){
                    count++;
            }
        }


    }
    System.out.println(count);    
    }
}