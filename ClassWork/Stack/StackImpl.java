package ClassWork.Stack;

import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> stackName = new Stack<>();
        stackName.push(1);
        stackName.push(2);
        System.out.println(stackName.peek()); //retrives (last in)value without removing
        System.out.println(stackName.pop()); // retrives values and removes from stack
        System.out.println(stackName.isEmpty()); // check is stack is empty or not?
    }
}
