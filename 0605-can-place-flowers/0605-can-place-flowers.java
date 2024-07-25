class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowerbedSize = flowerbed.length;

        if (flowerbedSize == 1) {
            if (flowerbed[0] == 0) {
                if (n > 0) {
                    flowerbed[0] = 1;
                    n--;
                }
            }
        } else if (flowerbedSize > 1) {
            for (int i = 0; i < flowerbedSize; i++) {
                if (i == 0) {
                    if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                        if (n > 0) {
                            flowerbed[i] = 1;
                            n--;
                        }
                    }
                } else if (i == flowerbedSize-1) {
                    if (flowerbed[flowerbedSize-1] == 0 && flowerbed[flowerbedSize-2] == 0) {
                        if (n > 0) {
                            flowerbed[i] = 1;
                            n--;
                        }
                    }
                } else if (flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                    if (n > 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
        }

        return n==0;
    }
}