// aabbbcc = a2b3c2
// abbccc = a1b2c3
import java.util.*;
public class CharRepeat {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
    int i=0;
    char ch=str.charAt(i);
    int count=0;
    for (int k=0; k<str.length(); k++){
        if (ch==str.charAt(k)){
            count++;
        }
        else{
            System.out.print(ch+""+count);
            ch= str.charAt(k);
            count=0;
            k--;
        }
        if (ch==str.charAt(str.length()-1) && k==str.length()-1){
            System.out.print(ch+""+count);
        }
    }
}
}
