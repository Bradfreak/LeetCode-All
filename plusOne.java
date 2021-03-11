//Plus One
class Solution {
    public int[] addF(int[] d, int len){
        int[] ans = new int[len+1];
        for(int i = 0; i < len+1; i++){
            if(i == 0){
                ans[i] = 1;
            }
            else{ans[i] = d[i-1];}
        }
        return ans;
    }
    public int[] plusOne(int[] digits) {
        int next = 0;
        for(int i = digits.length-1; i > -1; i--){
            if(digits[i] == 9){
                digits[i] = 0;
                next = 1;
            }
            else{
                digits[i]++;
            }
            if(next == 1){
                if(i == 0){
                    digits = addF(digits, digits.length);
                }
                next = 0;
            }
            else{
                break;
            }
        }
        return digits;
    }
}
