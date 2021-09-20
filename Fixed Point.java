// Given a list of unique integers nums sorted in ascending order, return the minimum i such that nums[i] == i. If there's no solution, return -1.

// This should be done in \mathcal{O}(log(n))O(log(n)) time.

// Constraints

// n ≤ 100,000 where n is the length of nums
// Example 1
// Input
// nums = [-5, -2, 0, 3, 4]
// Output
// 3
// Explanation
// Both nums[3] == 3 and nums[4] == 4 but 3 is smaller.

// Example 2
// Input
// nums = [-5, -4, 0]
// Output
// -1
// Explanation
// There's no i such that nums[i] = i.

class Solution {
    public int solve(int[] nums) {
       return binarySearch(0,nums.length-1,nums);
    }
    public int binarySearch(int start,int end,int[] nums){
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==nums[mid]){
                res=mid;
            }
            if(nums[mid]>=mid){    
                 end=mid-1;
                
            }
            else{
               start=mid+1;
            }
        }
        return res;
    }
}


// Your code took 95 milliseconds — faster than 98.73% in Java
