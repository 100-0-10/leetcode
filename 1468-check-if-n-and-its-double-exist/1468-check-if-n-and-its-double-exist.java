class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean isDouble = false;
        int size = arr.length;

        for (int i = 0; i <size; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i] == arr[j] * 2 || arr[i] * 2 == arr[j]) {
                    isDouble = true;
                    break;
                }
            }
        }
        
        return isDouble;
    }
}