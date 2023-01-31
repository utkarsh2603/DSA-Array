public class Array_Implementation
{
    public static void main(String[] args) {
        //array creation of size 10
        int array[]=new int[10];
        //array insertion
        for(int i=1;i<array.length;i++)
        {
            array[i]=i*2;
        }
        //printing the inserted values in array
        for(int i=1;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //updating values
        array[4]=1000;

        for(int i=1;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        System.out.println("size of array is: "+array.length);

    }
}
