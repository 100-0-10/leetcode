class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int str1Size = str1.length();
        int str2Size = str2.length();
        String str3 = str1+str2;
        int str3Size = str3.length();
        int min = Math.min(str1Size, str2Size);

        StringBuilder answer = new StringBuilder();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < str3Size; i++) {
            answer.append(str3.charAt(i));

            int answerSize = answer.length();
            if (str3Size % answerSize == 0 && min % answerSize == 0) {
                if (answer.toString().length() <= min) {
                    if (answer.toString().repeat(str3Size / answerSize).equals(str3)) {
                        set.add(answer.toString());
                    }
                }
            }
        }

        List<String> list = new ArrayList<>(set);

        list.sort(Comparator.comparing(String::length).reversed());

        if (list.size() > 0) {
            return list.get(0);
        } else {
            return "";
        }
    }
}