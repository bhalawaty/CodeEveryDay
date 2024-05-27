package topInterviewQuestions.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String x = "([]";
        boolean result = isValid(x);
        System.out.println("Indices: " + result);

    }

    /**
     * <a href="https://leetcode.com/problems/valid-parentheses/">...</a>
     */
    public static boolean isValid(String x) {

        if (x.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> keyValuePairs = new HashMap<>();
        keyValuePairs.put('(', ')');
        keyValuePairs.put('[', ']');
        keyValuePairs.put('{', '}');


        Stack<Character> stack = new Stack<>();

        for (char ch : x.toCharArray()) {
            if (keyValuePairs.containsKey(ch)) {
                stack.push(ch);
            } else if (keyValuePairs.containsValue(ch)) {
                if (stack.isEmpty() || keyValuePairs.get(stack.pop()) != ch) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

// the overall time complexity of the function is 𝑂(𝑛), where n is the length of the input string.


