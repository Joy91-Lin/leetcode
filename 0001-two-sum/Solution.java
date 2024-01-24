class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tmpMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int currentNum = nums[i];
            int deltaNum = target - currentNum;
            if(tmpMap.containsKey(deltaNum)){
               return new int[]{i, tmpMap.get(deltaNum)};
            }
            tmpMap.put(currentNum, i);
        }
        return new int[]{};
    }
}