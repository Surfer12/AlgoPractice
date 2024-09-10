package AlgoAttempts;

import java.util.Stack;

public class StackAttempt2Impl extends StackAttempt1 {
    boolean stackComparison(Stack<Character> stack) {
        if (stack == null) {
            throw new IllegalArgumentException("Stack is null");
        }

        Stack<Character> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            Character element = stack.pop();
            if (isOpening(element)) {
                tempStack.push(element);
            } else if (isClosing(element)) {
                if (!tempStack.isEmpty() && isMatching(tempStack.peek(), element)) {
                    tempStack.pop();
                } else {
                    return false; // Unmatched closing bracket found
                }
            }
        }

        return tempStack.isEmpty();
    }
}