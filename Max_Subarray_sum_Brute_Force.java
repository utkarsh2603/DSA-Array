public class Max_Subarray_sum_Brute_Force
{
    public static void max_subarray_sum(int array[])
    {
        int currSum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i< array.length;i++)
        {
            int start=i;
            for(int j=i;j< array.length;j++)
            {
                int end=j;
                currSum=0;
                for(int k=i;k<=j;k++)
                {
                    currSum+=array[k];
                    if(currSum>max)
                    {
                        max=currSum;
                    }
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int array[]={-2,-3,4,-1,-2,1,5,-3};

        max_subarray_sum(array);
    }
}
