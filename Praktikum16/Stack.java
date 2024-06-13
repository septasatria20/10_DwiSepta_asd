package Praktikum16;

public class Stack {
    int size;
    int top;
    int data[];

    public Stack(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1; // Perbaikan sintaks isFull()
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
            System.out.println("Successfully pushed data");
        } else {
            System.out.println("The stack is full!");
        } // Menambahkan tanda kurung kurawal
    }

    public void pop() {
        if (!isEmpty()) { // Perbaikan sintaks isEmpty()
            int x = data[top];
            top--;
            System.out.println("Data was popped out of the Stack: " + x);
        } else {
            System.out.println("Stack is still empty");
        }
    }

    public void peek() {
        if (!isEmpty()) { // Perbaikan sintaks isEmpty()
            System.out.println("Top element: " + data[top]);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void print() {
        if (!isEmpty()) { // Perbaikan sintaks isEmpty()
            System.out.print("Stack contents: ");
            for (int i = top; i >= 0; i--) { // Perbaikan loop print()
                System.out.print(data[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void clear() {
        if (!isEmpty()) { // Perbaikan sintaks isEmpty()
            top = -1;
            System.out.println("The stack has been cleared");
        } else {
            System.out.println("Failed! Stack is already empty");
        }
    }

    public static void main(String[] args) {
        int sizeStack = 5;
        Stack stk = new Stack(sizeStack);
        System.out.println("Maximum number of stack elements is: " + sizeStack); // Perbaikan sintaks println()
        stk.clear();
        stk.push(15);
        stk.push(27);
        stk.push(13);
        stk.push(11);
        stk.push(34);
        stk.pop();
        stk.peek();
        stk.push(18);
        stk.push(40);
        stk.print();
    }
}
