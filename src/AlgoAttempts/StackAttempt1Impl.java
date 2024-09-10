package AlgoAttempts;
import java.util.Stack;

public class StackAttempt1Impl extends StackAttempt1 {
    boolean stackComparison(Stack<Character> stack){
        if(stack.equals(null)){throw new IllegalArgumentException("Stack is null");}
    while(!stack.isEmpty()){
        for(Character element : stack){
            if(isOpening(element)){
                stack.push(element); 
            }
        if (isClosing(element)) { // if the element is a closing bracket and the stack is not empty and the top of the stack is the matching opening bracket, then pop the stack
            if (!stack.isEmpty() && isMatching(stack.peek(), element)) {
                stack.pop();
            } else {
                return false; // Unmatched closing bracket found
            }
        }
        }
    }
    return stack.isEmpty();
}
}
