package AlgoAttempts;

import java.util.Stack;

abstract class StackAttempt1 {

    final char openingParenthesis = '(';
    final char closingParenthesis = ')';
    final char openingBracket = '[';
    final char closingBracket = ']';
    final char openingBrace = '{';
    final char closingBrace = '}';

    boolean isMatching(char a, char b){
        if(a == openingParenthesis && b == closingParenthesis) return true;
        if(a == openingBracket && b == closingBracket) return true;
        if(a == openingBrace && b == closingBrace) return true;
        return false;
    }

    boolean isOpening(char a){
        if(a == openingParenthesis) return true;
        if(a == openingBracket) return true;
        if(a == openingBrace) return true;
        return false;
    }

    boolean isClosing(char a){
        if(a == closingParenthesis) return true;
        if(a == closingBracket) return true;
        if(a == closingBrace) return true;
        return false;
    }

    void addToStack(Stack<Character> stack, char c) {
        for(Character element : stack){
            if (isOpening(element)) {
                stack.push(c);
            }
        }
    }
}


