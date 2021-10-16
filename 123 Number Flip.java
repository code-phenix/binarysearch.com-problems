// You are given an integer n consisting of digits 1, 2, and 3 and you can flip one digit to a 3. Return the maximum number you can make.

// Constraints

// 1 ≤ n < 2 ** 31
// Example 1
// Input
// n = 123
// Output
// 323
// Explanation
// We flip 1 to 3

// Example 2
// Input
// n = 333
// Output
// 333
// Explanation
// Flipping doesn't help.

class Solution {
    public int solve(int n) {
        String str=String.valueOf(n);
        int num=0,size=str.length();
        boolean flag=true;
        for(int iterI=0;iterI<size;iterI++){
            num*=10;
            int temp=Character.getNumericValue(str.charAt(iterI));
            if(temp!=3 && flag){
                temp=3;
                flag=false;
            }
            num+=temp;
        }
        return num;
    }
}

//Your code took 2 milliseconds — faster than 96.37% in Java
