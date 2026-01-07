/* Count the words in a sentence which are start with vowel. 
 * 
 * Input: Arijit is student of MCA
 * Output: 3
 * 
 * Input: Sara plays tennis
 * Output: No such words
*/
import java.util.*;
public class count_word_vowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split("\\s+");
        String vowels= "aeiouAEIOU";
        int count=0;
        for (int i=0; i<word.length; i++){
            if (!word[i].isEmpty() && vowels.indexOf(word[i].charAt(0)) != -1){
                count++;
            }
        }
        if (count>0){
            System.out.println(count);
        }
        else { System.out.println("No such word"); }
    }
}
/*
import java.util.*;
public class Count_Word_Vowel {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String[] arr = s.split(" ");
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            char d = arr[i].charAt(0);
            if(d=='a' || d=='e' || d=='i' || d=='o' || d=='u')
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println("No such words");
        }
    }
}
    */