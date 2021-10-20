// Given a list of integers nums, swap each consecutive even indexes with each other, and swap each consecutive odd indexes with each other.

// Constraints

// n ≤ 100,000 where n is the length of nums
// Example 1
// Input
// nums = [0, 1, 2, 3, 4, 5, 6, 7, 8]
// Output
// [2, 3, 0, 1, 6, 7, 4, 5, 8]
// Explanation
// 0 and 2 gets swapped
// 1 and 3 gets swapped
// 4 and 6 gets swapped
// 5 and 7 gets swapped
// 8 remains the same

class Solution {
    public static void swap(int nums[],int indexI,int indexJ){
        int temp=nums[indexI];
        nums[indexI]=nums[indexJ];
        nums[indexJ]=temp;
    }
    public int[] solve(int[] nums) {
        int size=nums.length;
        int res=1;
        for(int iterI=0;iterI<size-2;iterI++){
            if(res==3 && iterI<size-2){
                res=1;
                iterI=iterI+2;
            }
            if(iterI>=size-2){
                break;
            }
            swap(nums,iterI,(iterI+2));
            res++;
        }
        return nums;
    }
}

//Your code took 20 milliseconds — faster than 71.11% in Java
