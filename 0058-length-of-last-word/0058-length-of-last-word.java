class Solution {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        String answer = "";

        if (strs.length > 0) {
            for (int i = strs.length-1; i < strs.length; i--) {
                if (!strs[i].isEmpty()) {
                    answer = strs[i];
                    break;
                }
            }
        }

        return answer.length();
    }
}