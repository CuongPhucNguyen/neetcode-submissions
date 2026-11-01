class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (Character i : s.toCharArray()) {
            if (')' == i) {
                if (!stack.isEmpty() && '(' == stack.peek()) {
                    stack.pop();
                } else return false;
            } else if (']' == i) {
                if (!stack.isEmpty() && '[' == stack.peek()) {
                    stack.pop();
                } else return false;
            } else if ('}' == i) {
                if (!stack.isEmpty() && '{' == stack.peek()) {
                    stack.pop();
                } else return false;
            } else {
                stack.push(i);
            }
        }

        return stack.size() == 0;
    }
}
