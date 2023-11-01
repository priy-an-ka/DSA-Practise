package Arrays;

public class LeftAndRightSumDiff {
    public static void main(String[] args) {
        int nums[] = {10,4,8,3};
        int[] answer = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                answer[i]=0;
            }
            else
            {
                answer[i]=sum;
            }
            sum=sum+nums[i];
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i!=nums.length-1)
            {
                answer[i]=(int)Math.abs(answer[i]-sum);
            }
            sum=sum+nums[i];
        }
        for(int i=0;i<answer.length;i++)
            System.out.println(answer[i]);



    }
}
