class Stack {
    int[] stack;
    int tos;

    final int MAX_SIZE = 20;

    Stack() {
        stack = new int[MAX_SIZE];
        tos = -1;
    }

    void push(int item) {
        if(tos >= MAX_SIZE-1)      System.out.println("Stack overflow");
        else   stack[++tos] = item;
    }

    void pop() {
        if(tos <= -1)    System.out.println("Stack underflow");
        else   System.out.println(stack[tos--]+" is popped"); 
    }

    void display() {
        if(tos <= -1)   System.out.println("Stack is empty");
        else{
            System.out.println("The stack is :");
            for(int i = tos; i > 1; i--)
                System.out.print(" \t"+stack[i]);
            System.out.println();
       }
    }
}

public class DemoStack {
    public static void main(String[] args) {
        Stack s = new Stack();

        for(int i = 0; i < 100; i+=10)
            s.push(i);
        s.display();
        s.pop();
        s.pop();
        s.pop();
        s.display();
    }
}

