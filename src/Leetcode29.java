import java.util.Stack;

public class Leetcode29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] charArray = s.toCharArray();
	    for (char c : charArray) {
            if (stack.isEmpty() && (c == ')' || c == '}' || c == ']')) return false;
            else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(' && c == ')') {
                    	stack.pop();
                    }
                    else if (stack.peek() == '{' && c == '}') {
                    	stack.pop();
                    }
                    else if (stack.peek() == '[' && c == ']') {
                    	stack.pop();
                    }
                    else {
                    	stack.add(c);
                    }
                } else {
                	stack.add(c);
                }
            }
        }
	    return stack.empty();
	}
}
