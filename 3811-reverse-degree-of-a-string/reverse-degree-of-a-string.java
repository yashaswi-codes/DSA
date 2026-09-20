class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int position;
        char character;
        int reverse;
        int total;
        
        for(int i = 0; i < s.length(); i++){

            position = i + 1;

            character = s.charAt(i);

            reverse = 27 - (character - 'a' + 1);

            total = reverse * position;

            ans = ans + total ;
        }

        return ans;
    }
}