class Stack{

    private int[] arr = new int[5];
    int top = -1;
    int size;

    public Stack(){
        size = arr.length;
        top=-1;
    }

    public void push(int data){
        if (top < size-1){
            arr[++top] = data;
        } else {
            System.out.println("Stack Overflow");
    }
}

    public int pop()
    {
        if (top>-1)
            return arr[top--];
        else {
            System.out.println("Stack Underflow");
        }
        return 0;
    }

    public int peek(){
        return arr[top];
    }

    public void printStack(){
        for(int n: arr){
            System.out.print(n + " ");
        }
    }
    
}


public class stack_1{
    public static void main(String[] args){

        Stack nums = new Stack();

        nums.push(10);
        nums.push(20);
        nums.pop();
        nums.push(30);    
        nums.push(90);
        nums.push(40);      
        nums.push(50);
        nums.push(60);  // Stack Overflow
        


        nums.printStack();
    }
}