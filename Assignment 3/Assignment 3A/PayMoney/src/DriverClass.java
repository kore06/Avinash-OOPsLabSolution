import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Transactions transactions = new Transactions();
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int transArr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the value of transactions" + (i+1));
			transArr[i] = sc.nextInt();
		}
		System.out.println("Enter the no. of targets to acheive");
		int target = sc.nextInt();
		for(int i=0;i<target;i++)
		{
			System.out.println("Enter the target values: ");
			int t1 = sc.nextInt();
			int transNo=transactions.isTargetAchieved(transArr, t1);
			if(transNo == -1)
			{
				System.out.println("Target not acheived");
			}
			else 
			{
				System.out.println("Target acheived at "+ transNo +" transaction");
			}
		}
	}

}
