/* Find number of upper case in a string
 * AriJIt = 3
 */

import java.util.*;
public class count_UpperCase {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String word= sc.nextLine();
        int count=0;
        for (int i=0; i<word.length(); i++){
            if (Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
