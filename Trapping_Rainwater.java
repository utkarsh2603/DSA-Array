public class Trapping_Rainwater
{
    public static int storedWater(int height[])
    {
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }

        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        int trappedWater=0;
        for(int i=0;i<n;i++)
        {
            int waterLevel=Math.min(leftmax[i],rightmax[i]);
            trappedWater+=waterLevel-height[i];
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};

        System.out.println(storedWater(height));
    }
}
