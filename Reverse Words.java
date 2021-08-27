// Given a string s of words delimited by spaces, reverse the order of words.

// Constraints

// n ≤ 100,000 where n is the length of s
// Example 1
// Input
// sentence = "hello there my friend"
// Output
// "friend my there hello"

class Solution {
    public String solve(String sentence) {
        String ans[]=sentence.split(" ");
        int size=ans.length;
        String res="";
        for(int i=size-1;i>=0;i--){
            res+=ans[i];
            if(i!=0)
                res+=" ";
        }
        return res;
    }
}

// Reverse Words in 10ms in java — faster than 63.00%
