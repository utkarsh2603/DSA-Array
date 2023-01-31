public class Largest_In_An_Array
{
    public static int largest(int array[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int array[]={25,35,79,38,76,45};

        System.out.println(largest(array));
    }
}
