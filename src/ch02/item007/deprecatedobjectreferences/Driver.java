package ch02.item007.deprecatedobjectreferences;

public class Driver {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        for (int i = stack.size(); i > 0; i--) {
            System.out.println(stack.pop());
        }
    }
}
