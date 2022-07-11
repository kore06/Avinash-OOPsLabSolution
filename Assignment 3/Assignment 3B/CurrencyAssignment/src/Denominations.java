import java.util.Arrays;
import java.util.Scanner;

public class Denominations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of denominations used :");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the values of the array");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		Mergesort merge = new Mergesort();
		merge.sort(arr, 0, num-1);
		System.out.println("The denominations in decreasing order"+ Arrays.toString(arr) );
		System.out.println("Enter the amount to pay");
		int pay = sc.nextInt();
		NotesCount count = new NotesCount();
		count.countDenominations(arr, pay);
	}
}
