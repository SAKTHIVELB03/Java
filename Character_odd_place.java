/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
*/

import java.util.*;
public class Character_odd_place {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String req="";
        for (int i=0; i<str.length(); i++){
            if (i%2 != 0){
                req+=str.charAt(i);
            }
        }
        System.out.println(req);
    }
}
