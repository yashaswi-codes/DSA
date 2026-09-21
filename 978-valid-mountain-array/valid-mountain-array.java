class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int i = 0;

        //Increasing part
        while(i < arr.length - 1 && arr[i] < arr[i+1] ){
            i++;
        }

        //peek
        while(i == 0 || i == arr.length - 1){
            return false;
        }

        //Decreasing part
        while(i < arr.length - 1 && arr[i] > arr[i+1] ){
            i++;
        }

        boolean ans = false;

        if(i == arr.length - 1){
            ans = true;
        }
        
        return ans;
    }
}