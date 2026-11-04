class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push('%');
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                char top = stack.pop();
                if (top == '(' && s.charAt(i) != ')') {
                    return false;
                } else if (top == '[' && s.charAt(i) != ']') {
                    return false;
                } else if (top == '{' && s.charAt(i) != '}') {
                    return false;
                } else if (top == '%') {
                    return false;
                }
            }
        }
        stack.pop();
        return stack.isEmpty();
    }
}