public class Reversing_An_Array
{
    public static void reverse(int array[])
    {
        int first=0;
        int last= array.length-1;

        while(first<=last)
        {
            int temp=array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }
    }
    public static void print_reverse(int array[])
    {
        for(int i=0;i< array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int array[]={35,74,38,76,92,45,99};

        //first method

//        for(int i= array.length-1;i>=0;i--)
//        {
//            System.out.print(array[i]+" ");
//        }
        reverse(array);
        print_reverse(array);
    }
}
