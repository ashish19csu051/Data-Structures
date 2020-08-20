import java.util.*;
public class question3
{
	static int addAll(int[] arr)
	{
         int sum = 0;
         int i;  
         for (i = 0; i < arr.length; i++) 
           sum += arr[i]; 
         return sum; 
	}
	static int secondlarge(int[] arr)
	{
		 int largest = arr[0];
		int secondLargest = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > largest) 
			{
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) 
			{
				secondLargest = arr[i];
			}
			return secondLargest;
    }
	static int alternate(int[] arr)
	{
	   int alt = 0;
       for (int i=0; i<arr.length; i+=2)
         alt+=arr[i];
        return alt;
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter no of elements : ");
	    int count = sc.nextInt();
	    int[] arr = new int[size];
	    if(count>size)
	    {
	    	System.out.println("elements should be less than size.");
	    }else
	    {
	    	System.out.println("Enter elements : ");
	     for(int i=0;i<count;i++)
	     {
	    	arr[i] = sc.nextInt();
	     }
	    
	    for(int value : arr)
	    {
	    	System.out.println("Elements elements are : " + value);
	    }
	    System.out.println("Sum of all elements is : " + addAll(arr));
	    System.out.println("Second highest element is : " + secondlarge(arr));
	    System.out.println("Sum of alternate elements is : " + alternate(arr));
    }
}
}