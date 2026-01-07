/* Find number of lower case in a string
 * AriJIt = 3
 */

import java.util.*;
public class count_Lowercase {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String word= sc.nextLine();
        int count=0;
        for (int i=0; i<word.length(); i++){
            /*
            if (((int) word.charAt(i)>=97) && ((int) word.charAt(i)<=122)){
                count++;
            }
            */
            if (Character.isLowerCase(word.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
