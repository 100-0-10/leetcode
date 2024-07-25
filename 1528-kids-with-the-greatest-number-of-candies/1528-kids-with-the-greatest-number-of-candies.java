class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int max = 0;

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int candy : candies) {
            candy += extraCandies;

            if (candy >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}