class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i =0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]= i;
                    result[1]=j;
                    return result;
                }
            }
            
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int results[] = twoSum(nums,target);
        System.out.println(""+results[0]);
        System.out.println(""+results[1]);
    }
}

