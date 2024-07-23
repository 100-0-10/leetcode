class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean isUp = false;
        boolean isDown = false;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (i == size -1) {
                break;
            }

            if (arr[i] == arr[i+1]) {
                isUp = false;
                isDown = false;
                break;
            }

            if (arr[i] < arr[i+1]) {
                if (!isDown) {
                    isUp = true;
                } else {
                    isUp = false;
                    break;
                }
            } else if (arr[i] > arr[i+1]) {
                if (isUp) {
                    isDown = true;
                } else {
                    break;
                }
            }
        }
        
        return isUp && isDown;
    }
}