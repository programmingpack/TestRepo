import java.util.Scanner;

public class LinearSerachUserInput {

	
	public static int search(int arr[],int x) {
		int n= arr.length;
		for(int i=0;i<=n;i++) {
			if (arr[i] == x)
				return i;
		}
		
		return -1;
		
	}
	
	public static void main(String args[]) {
		
		int arr[],x,result,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=in.nextInt()	;
		arr=new int[n];
		System.out.println("Enter integers");
		for(int c=0;c<n;c++)
			arr[c]=in.nextInt();
			
		System.out.println("Enter value to find");
		x=in.nextInt();
		result=search(arr,x);
				if(result == -1)
					System.out.print("Element is not present ");
					else
						System.out.println("Element is present at index = "+ result);
				
			
		}
}
	
