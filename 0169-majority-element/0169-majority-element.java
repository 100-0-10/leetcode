class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int answerKey = 0;
        int answerValue = 0;
        for (Integer key : map.keySet()) {
            if (answerValue < map.get(key)) {
                answerValue = map.get(key);
                answerKey = key;
            }
        }

        return answerKey;
    }
}