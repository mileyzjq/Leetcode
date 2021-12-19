class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> name=new HashMap<Integer,Integer>();
        int arr[]=new int[2];
        for(int a=0;a<nums.length;a++)
            name.put(nums[a],a);
        for(int a=0;a<nums.length;a++)
        {
            int rem=target-nums[a];
            if(name.containsKey(rem)==true && name.get(rem)!=a)
            {
                arr[0]=a;
                arr[1]=name.get(rem);
                break;
            }
        }
        return arr;
    }
}