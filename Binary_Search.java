public class Binary_Search
{
    public static int binarySearch(int array[],int key)
    {
        int start=0;
        int end= array.length-1;

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(array[mid]==key)
            {
                return mid;
            }
            if(array[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={25,35,74,38,76,92,45,99};
        int key=99;

        int found=binarySearch(array,key);

        if(found==-1)
        {
            System.out.println("Key not found");
        }
        else
        {
            System.out.println("Key found at: "+found);
        }
    }
}
