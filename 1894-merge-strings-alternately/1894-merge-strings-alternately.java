class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();

        int min = Math.min(word1.length(), word2.length());

        for (int i = 0; i < min; i++) {
            answer.append(word1.charAt(i));
            answer.append(word2.charAt(i));
        }

        if (word1.length() > word2.length()) {
            answer.append(word1.substring(min));
        } else {
            answer.append(word2.substring(min));
        }

        return answer.toString();
    }
}