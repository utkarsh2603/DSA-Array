public class Print_Subarrays
{
    public static void print_subarrays(int array[])
    {
        //i=start
        //j=end
        //k=start to end
        for(int i=0;i< array.length;i++)
        {
            int start=array[i];
            for(int j=i;j< array.length;j++)
            {
                int end=j;
                for(int k=i;k<j;k++)
                {
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};

        print_subarrays(array);
    }
}
