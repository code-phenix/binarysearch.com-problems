// Given two strings s0 and s1, each representing a sentence, return the number of unique words that are shared between the two sentences.

// Note: words are case-insensitive so "hello" and "Hello" are the same word.

// Constraints

// n ≤ 100,000 where n is the length of s0
// m ≤ 100,000 where m is the length of s1
// Example 1
// Input
// s0 = "hello world hello oyster"
// s1 = "world is your oyster"
// Output
// 2
// Explanation
// Only "world" and "oyster" are shared between the two sentences.

import java.util.HashSet;

class Solution {
    public int solve(String s0, String s1) {
        if(s0==null||s1==null||s0.length()==0||s1.length()==0)
            return 0;
        String[] s2=s0.split(" ");
        String[] s3=s1.split(" ");
        HashSet<String> hs=new HashSet<>();
        String temp;
        for(String iterI:s2){
            temp=iterI.toLowerCase();
            hs.add(temp);
        }
        int res=0;
        for(String iterI:s3){
            temp=iterI.toLowerCase();
            if(hs.contains(temp)){
                res++;
                hs.remove(temp);
            }
        }
        return res;
    }
}


//Your code took 88 milliseconds — faster than 99.37% in Java
