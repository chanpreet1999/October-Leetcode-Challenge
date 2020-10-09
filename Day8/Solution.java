class Solution {
    public int search(int[] nums, int target) {
       int n=nums.length;
        return BinarySearch(nums,target,0,n-1);
    }
    
    public int BinarySearch(int[] nums,int target, int si,int ei)
    {
        if(target>nums[ei] || target<nums[si])
            return -1;
        int mid=(si+ei)/2;
        if(target==nums[mid])
            return mid;
        if(mid>=si && target<nums[mid])
            return BinarySearch(nums,target,si,mid-1);
        else if(mid<=ei)
            return BinarySearch(nums,target,mid+1,ei);
        return -1;
    }
}