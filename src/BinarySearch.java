
public class BinarySearch {

	int search(int arr[],int start,int end,int x) {
		//start=0; end=arr.length-1;
		if (end >= start) {
			 int mid=start + (end-start)/2;
			 if(arr[mid] == x)
				 return mid;
			 if(arr[mid]>x)
				 return search(arr,start,mid-1,x);
		     
		    return search(arr,mid+1,end,x);
			
		}
		
		return -1;
		
	}
	
	

	public static void main(String[] args) {
		
       BinarySearch a=new BinarySearch();
       int arr[]= {1,2,3,4,5,6,7,8};
       int x = 3;
       int result=a.search(arr, 0, arr.length-1, x);
       if(result == -1) {
    	   System.out.println("Element is not present");
       }
       else
    	   System.out.println("Element present at index " + result );
       
       
	}

}
