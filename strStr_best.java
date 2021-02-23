//Implement strStr()
//Done using String fuctions 
//Best Version
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        
        return haystack.indexOf(needle);
    }
}
