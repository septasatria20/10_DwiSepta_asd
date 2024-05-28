package Praktikum8;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(8);
        stack.push(12);
        stack.push(18);
        stack.print();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.push(-5);
        stack.print();
    }
}
