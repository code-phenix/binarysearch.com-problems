// Given a list of lowercase alphabet strings words, return the longest common prefix.

// Example 1
// Input
// words = ["anthony", "ant", "antigravity"]
// Output
// "ant"
// Explanation
// "ant" is the longest common prefix between the three strings.

class Solution {
    public static boolean check(String[] words,String word){
        for(String str:words){
            if(str.indexOf(word)!=0){
                return false;
            }
        }
        return true;
    }
    public String solve(String[] words) {
        int min=words[0].length();
        String shortWord=words[0];
        for(String str:words){
            int len=str.length();
            if(min>len){
                min=len;
                shortWord=str;
            }
        }
        StringBuilder sb=new StringBuilder(shortWord);
        if(check(words,sb.toString()))
            return sb.toString();
        min--;
        while(min>=0){
            sb.deleteCharAt(min);
            if(check(words,sb.toString()))
                return sb.toString();
            min--;
        }
        return "";
    }
}
//Your code took 118 milliseconds — faster than 78.88% in Java

