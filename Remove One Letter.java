// Given two strings s0 and s1, return whether you can obtain s1 by removing 1 letter from s0.

// Constraints

// 0 ≤ n ≤ 200,000 where n is the length of s0
// 0 ≤ m ≤ 200,000 where m is the length of `s1
// Example 1
// Input
// s0 = "hello"
// s1 = "hello"
// Output
// false
// Example 2
// Input
// s0 = "hello"
// s1 = "helo"
// Output
// true
class Solution {
    public boolean solve(String s0, String s1) {
        if(s0.length()==1&&s1.length()==0)
            return true;
        if(s0.length()==s1.length()+1){
            boolean flag=false;
            int size=s0.length();
            int str0=0,str1=0;
            while(str0<size&&str1<size-1){
                if(s0.charAt(str0)==s1.charAt(str1)){
                    str0++;
                    str1++;
                }
                else{
                    if(!flag){
                        flag=true;
                        str0++;
                    }
                    else
                        return false;
                }
            }
            if(flag||str1==size-1)
                return true;
        }
        return false;
    }
}
//Your code took 7 milliseconds — faster than 95.68% in Java
