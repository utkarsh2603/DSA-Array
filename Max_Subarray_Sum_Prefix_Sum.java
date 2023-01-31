public class Max_Subarray_Sum_Prefix_Sum
{
    public static void max_subarray_sum(int array[])
    {
        int currSum=0;
        int max=Integer.MIN_VALUE;
        int n=array.length;
        int prefix[]=new int[n];
        prefix[0]=array[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+array[i];
        }

        for(int i=0;i<n;i++)
        {
            int start=i;
            for(int j=i;j<n;j++)
            {
                int end=j;
                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];

                if(currSum>max)
                {
                    max=currSum;
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
