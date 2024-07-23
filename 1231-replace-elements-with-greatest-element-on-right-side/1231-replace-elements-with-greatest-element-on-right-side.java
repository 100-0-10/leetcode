class Solution {
    public int[] replaceElements(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (i == size-1) {
                arr[i] = -1;
                break;
            }

            arr[i] = arr[i + 1];
            for (int j = i+1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[j];
                }
            }
        }
        
        return arr;
    }
}