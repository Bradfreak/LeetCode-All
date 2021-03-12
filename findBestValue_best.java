//Sum of Mutated Array Closest to Target
//Best Solution
class Solution {
    int[] ar;
    int t;
    public int sum(int fix){
        int su = 0;
        for(int i : ar){
            su = (i <= fix) ? su+i : su+fix;
        }
        return (su - t);
    }
    public int findBestValue(int[] arr, int target) {
        ar = arr;t = target;
        int sp = target/arr.length,sp1;
        int diff = sum(sp), diff1;
        while(true){
            sp1 = sp;
            if(diff >= 0){
                sp1--;
            }
            else{
                sp1++;
            }
            diff1 = sum(sp1);
            if(Math.abs(diff1) < Math.abs(diff)){
                sp = sp1;
                diff = diff1;
            }
            else{
                break;
            }
        }
        return sp;
    }
}

