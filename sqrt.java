//Sqrt(x)
class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
        
        long low=1,high=x,mid, square;
        int ans=0;
        while(low<=high){
            mid=(low+high)/2;
            square=mid*mid;
            if(square==x){
                return ((int)mid);
            }
            else if(square > x){
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=(int)mid;
            }
        }
        return ans;
    }
}
