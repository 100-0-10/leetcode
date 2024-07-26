class Solution {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");

        Stack<String> stack = new Stack<>();

        for (String s1 : ss) {
            if (!s1.isEmpty()) {
                stack.push(s1);
                stack.push(" ");
            }
        }

        StringBuilder sb = new StringBuilder();
        stack.pop();
        
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}