
public class Transactions {
	public int isTargetAchieved(int arr[],int val)
	{
		int status = -1;
		long sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(sum>=val)
			{
				status= i+1;
				break;
			}
		}
		return status;
	}
}
