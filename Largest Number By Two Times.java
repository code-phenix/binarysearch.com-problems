import java.util.*;

class Solution {
    
    public boolean solve(int[] nums) {
        if(nums.length<2)
            return false;
        int max1=0,max2=0;
        if(nums[0]<=nums[1]){
            max1=nums[1];
            max2=nums[0];
        }
        else{
            max2=nums[1];
            max1=nums[0];
        }
        
        for(int i=2;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
            }
            else if(nums[i]>max2)
                max2=nums[i];
        }
        // System.out.println("max1="+max1);
        // System.out.println("max2="+max2);
        return 2*max2<max1;

    }
}

//Your code took 143 milliseconds — faster than 37.07% in Java
