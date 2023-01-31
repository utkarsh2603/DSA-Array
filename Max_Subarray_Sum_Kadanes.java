public class Max_Subarray_Sum_Kadanes
{
    public static void max_subarray_sum(int array[])
    {
        int max=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<array.length;i++)
        {
            currSum+=array[i];
            if(currSum<0)
            {
                currSum=0;

            }
            if(currSum>max)
            {
                max=currSum;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};

        max_subarray_sum(array);
    }
}
