//Palindrome Number
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x < 10){
            return true;
        }
        int ans = 0, temp = x;
        while(temp > 0){
            ans = (ans * 10) + (temp % 10);
            temp /= 10;
        }
        if(x == ans){return true;}
        else{return false;}
    }
}
