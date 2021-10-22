import java.util.Scanner;
public class LuckyNumber {
	public static int luckyNo(int[] arr) {
		int[] a = new int[40];
		for(int i : arr) {
			a[i]++;
		}
		for(int j = a.length - 1 ; j > 0; j--)
			if(a[j] == j) 
			{
				return j;
		}
		return -1;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n=s.nextInt();
		int [] arr = new int[n];
		System.out.print("Input:");
		for(int k=0; k<n;k++) {
			arr[k] = s.nextInt();
		}
		int temp= luckyNo(arr);
		System.out.println("Output: "+temp);
	}
}
