class Solution {
    public int[] replaceElements(int[] arr) {
        int size = arr.length;
        int max = 0;

        for (int i = size-1; i >= 0; i--) {
            if (i == size-1) {
                max = arr[i];
                arr[i] = -1;
                continue;
            }

            int min = max;
            max = arr[i];
            arr[i] = Math.max(min, arr[i+1]);
        }
        
        return arr;
    }
}