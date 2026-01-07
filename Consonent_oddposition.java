/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Arijit Ghosh
 * Output: hs
 */

import java.util.*;
public class Consonent_oddposition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String vowels ="aeiouAEIOU";
        for (int i=1; i<str.length()+1; i++){
            if ((i%2 !=0) && (vowels.indexOf(str.charAt(i-1)) == -1) && (str.charAt(i-1) !=' ')){
                System.out.print(str.charAt(i-1));
            }
        } 
    }
}
