//Sum of Mutated Array Closest to Target
class Solution {
    int[] ar;
    int t;
    public int sum(int fix){
        int su = 0;
        for(int i : ar){
            su = (i <= fix) ? su+i : su+fix;
        }
        return Math.abs(su - t);
    }
    public int findBestValue(int[] arr, int target) {
        ar = arr;t = target;
        int r = 0, l = 0, mid;
        int min = 0, minv = Integer.MAX_VALUE, midv = 0;
        for(int i: arr){
            r = (i > r) ? i : r;
        }
        mid = (r+l) >> 1;
        while(l <= r && r-l != 1){
            midv = sum(mid);
            if(minv > midv){
                minv = midv;
                min = mid;
            }
            else if(minv == midv){
                min = (min > mid) ? mid : min;
            }
            if(sum(mid-1) <= midv){
                r = mid;
            }
            else{
                l = mid;
            }
            mid = (l+r) >> 1;
        }
        mid = sum(l);
        midv = sum(r);
        if(minv > mid){
            minv = mid;
            min = l;
        }
        else if(minv == mid){
            min = (min > l) ? l : min;
        }
        if(minv > midv){
            minv = midv;
            min = r;
        }
        else if(minv == midv){
            min = (min > r) ? r : min;
        }
        return min;
    }
}
