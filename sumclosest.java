import java.util.*;
class sumclosest
{
public static void main(String args[])
{
	// int arr[]={-1,2,1,-4};
	Scanner s=new Scanner(System.in);
	System.out.println("enter number of elements");
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("enter elements");
	for(int i=0;i<n;i++)
	{
        arr[i]=s.nextInt();

    }
	int t=1;
	int output=0;
	int min=Integer.MAX_VALUE; //we take it to get difference between sum and target,so that
	// we can assume the slight difference value could be the closest value
	Arrays.sort(arr); //we sort the array to make solution much better
	for(int i=0;i<arr.length;i++)
	{
		int j=i+1;
		int k=arr.length-1; //it could be last index
		while(j<k)
		{
			int sum=arr[i]+arr[j]+arr[k];
			int diff=Math.abs(sum-t);
			if(diff==0)
			{
			System.out.println(sum);
			}
			if(diff<min)
			{
				min=diff;
				output=sum;
			}
			if(sum<=t)
			{
				j++;
			}
			else
			{
				k--;
			}

		}
	}
	System.out.println("final result:"+output);
	// return output;
}
}