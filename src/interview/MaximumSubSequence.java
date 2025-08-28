package interview;

public class MaximumSubSequence {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        int count=0,result=0;
        for(int num:nums){
            if(num==1){
                count++;
                result=Math.max(count,result);
            }
            else{
                count=0;
            }
        }

        System.out.println(result);
    }
}
