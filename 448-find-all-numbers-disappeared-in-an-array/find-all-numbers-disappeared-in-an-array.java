class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        //store all array elements in hashset
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        //Find missing no. and add them in result
        for(int i = 1; i <= nums.length; i++){

            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}