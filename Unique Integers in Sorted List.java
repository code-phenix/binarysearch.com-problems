// Given a list of sorted integers nums return the number of unique integers in the list.

// Contraints

// n ≤ 1,000,000 where n is the length of nums
// Notes

// \mathcal{O}(n)O(n) is accepted but \mathcal{O}(k\log{}n)O(klogn) is encouraged.
// Example 1
// Input
// nums = [2, 2, 2, 3, 4, 6, 6]
// Output
// 4
// Explanation
// The unique numbers are [2, 3, 4, 6]

class Solution {
    public static int binarySearch(int nums[],int key){
        int ans=-1;
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==key){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<key)
                left=mid+1;
            else
                right=mid-1;
                
        }
        return ans;
    }
    public int solve(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        
        int count=0;
        for(int i=0;i<nums.length;i++){
            binarySearch(nums,nums[i]);
            count++;
            i=binarySearch(nums,nums[i]);;
        }
        return count;
    }
}
//Your code took 67 milliseconds — faster than 100.00% in Java
