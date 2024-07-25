class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int kids = candies.length;
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < kids; i++) {
            int current = candies[i];
            boolean isMax = true;

            for (int j = 0; j < kids; j++) {
                if (i != j) {
                    if (current+extraCandies < candies[j]) {
                        isMax = false;
                        break;
                    }
                }
            }

            list.add(isMax);
        }

        return list;
    }
}