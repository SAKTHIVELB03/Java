/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".
 */
import java.util.*;
public class consecutive2vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String[] s=str.split(" ");
        String vowels = "aeiouAEIOU";
        int count=0;
        for (String i:s){
            if (i.length()>2){
                    for(int j=0; j<i.length()-1 ; j++){
                        if ((vowels.indexOf(i.charAt(j)) != -1) && (vowels.indexOf(i.charAt(j+1)) != -1)){
                            count++;
                            break;
                        }
                    }
            }
            }
            System.out.println(count);
        }
    }
