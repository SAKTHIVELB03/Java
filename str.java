public class str {
    
}
/*
1-creating a string
-------------------
String s1 = "Hello";              // using string literal
String s2 = new String("World");  // using new keyword

2. String Methods
-----------------
Here are some commonly used methods in the String class:

Method	Description
length()	Returns number of characters
charAt(index)	Returns char at given index
substring(start, end)	Extracts substring
equals(str)	Compares content (case-sensitive)
equalsIgnoreCase(str)	Compares ignoring case
toLowerCase()	Converts to lowercase
toUpperCase()	Converts to uppercase
indexOf(char)	Finds first index of char
lastIndexOf(char)	Finds last index of char
contains(str)	Returns true if substring is present
replace(a, b)	Replaces one char/word with another
split(" ")	Splits string into array
trim()	Removes leading/trailing spaces
startsWith() / endsWith()	Checks prefix/suffix

Example:
=======
public class StringExample {
    public static void main(String[] args) {
        String str = " Java Programming ";
        System.out.println(str.length());                  // 19
        System.out.println(str.trim());                    // "Java Programming"
        System.out.println(str.toLowerCase());             // " java programming "
        System.out.println(str.charAt(2));                 // 'v'
        System.out.println(str.substring(1, 5));           // "Java"
        System.out.println(str.contains("Program"));       // true
    }
}

 
3-Comparing string
------------------
String a = "hello";
String b = "HELLO";

System.out.println(a.equals(b));            // false
System.out.println(a.equalsIgnoreCase(b));  // true


4- Concatenation
----------------
String s1 = "Hello";
String s2 = "World";
String s3 = s1 + " " + s2;        // "Hello World"

String s3 = s1.concat(" ").concat(s2);


5- Converting Other Types to String
-----------------------------------
int num = 100;
String s = String.valueOf(num);   // "100"

 */