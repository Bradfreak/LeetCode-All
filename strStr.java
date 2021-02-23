//Implement strStr()
//Done without String functions
class Solution {
    public int strStr(String haystack, String needle) {
        char[] str = haystack.toCharArray(), ser = needle.toCharArray();
        int ans = -1, len = str.length, lens = ser.length, i = 0, j = 0;
        if((len == 0 && lens == 0) || lens == 0){return 0;}
        if(len == 0){return -1;}
        while(i < len && j < lens){
            if(str[i] == ser[0] && (len - i) >= lens){
                ans = i;
                for(int k = 1; k < lens; k++){
                    if(str[i+k] != ser[j+k]){
                        ans = -1;
                        break;
                    }
                }
                if(ans != -1){break;}
            }
            i++;
        }
        return ans;
    }
}
