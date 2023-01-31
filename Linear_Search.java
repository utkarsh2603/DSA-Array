public class Linear_Search
{
    public static int linearSearch(int array[],int key)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={23,45,12,65,98,23,45};
        int key=46;

        int found=linearSearch(array,key);

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
