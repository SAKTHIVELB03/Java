public class array {
    public static void main(String[] arg){
        String[] Cars={"volvo","BMW" ,"audi","wv"};
        int[] myNum;

        for( String i: Cars) {
            System.out.println(i);
            //int a= i.length();
            System.out.println(i.length());
        }

        for (int i = 0; i < Cars.length; i++) {
            System.out.println(Cars[i]);
}

    }
}

/*

1- Declaring an array 
---------------------
int[] numbers;
String names;



2- Creating an array
--------------------
numbers = new int[5];
int[] numbers = new int[5];



3- Initislizing an array
------------------------
numbers[0]=10;
numbers[1]=20;



4- Initializing with values 
---------------------------
int[] numbers = {10,20,30,40,50};


5- Accessing array elements 
---------------------------
System.out.println(numbers[2]);


6- Length of an array
---------------------
System.out.println(numbers.length);


7- Looping through array
------------------------
for (int i=0; i< numbers.length; i++){
System.out.println(numbers[i]);
}

for (int num:numbers){
System.out.println(num);
}


8-Array of Strings
-------------------
String[] fruits = {"apple", "banana" "mango"}


9-User Input for Arrays
-----------------------
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];

for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
}


 */