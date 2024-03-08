import java.util.Stack;

public class BracketValidator {

    // Method called checkValidParentheses that returns a boolean indicating whether a string of brackets is valid or not.
    public static boolean checkValidParentheses(String expression) {

        // Obtain an array of the brackets (each element is a single bracket).
        String [] array = expression.split("");
        // Create a stack.
        Stack<String> stack = new Stack<>();

        // Iterate over the array of brackets.
        for(int i = 0; i < array.length; i++){
            String reversedBracket = getReversedBracket(array[i]);
            if(isLeftBracket(array[i])){
                stack.push(array[i]);
            }
            else{
                if(stack.isEmpty() || !stack.pop().equals(reversedBracket)){
                    return false;
                }
            }

        }

            // Obtain the reversed version of bracket.

            // Check if the bracket is an opening bracket. If it is, push it onto the stack.

            // If the stack is empty or if the popped bracket is not equal to the reverse bracket of the current bracket, return false as this must mean that the expression is invalid.

        // If the stack is empty after we have finished iterating over the array of brackets, then return true as this must mean that the expression is valid. If the stack is not empty, this must mean that the expression is invalid.
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    // Private helper method called isLeftBracket that returns a boolean value to indicate whether the bracket is a left (opening) bracket.
    private static boolean isLeftBracket(String bracket) {
        if(bracket.equals("[")|| bracket.equals("(") || bracket.equals("{" )){
            return true;
        }
        return false;
    }

    // Private helper method called getReversedBracket that returns a String which is the reverse version of the bracket passed to the method.
    private static String getReversedBracket(String bracket) {
        if(bracket.equals("{")){
            return "}";
        }
        else if (bracket.equals("[")){
            return "]";
        }
        else if (bracket.equals("(")){
            return ")";
        }
        else if(bracket.equals("}")){
            return "{";
        }
        else if (bracket.equals("]")){
            return "[";
        }
        else if (bracket.equals(")")){
            return "(";
        }
        else{
            return null;
        }

    }
}
