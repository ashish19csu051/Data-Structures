import java.util.*;



public class question2 {  
    public static void main(String[] args) {  
          
        int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements you wants to enter :" );

		n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter ["+(i+1)+"] element :" );
			arr[i]=sc.nextInt();
		}
          
          
        System.out.println("Elements of given array present on odd position: ");  
          
        for (int i = 0; i < arr.length; i = i+2) {   
            System.out.println(arr[i]);   
        } 

       System.out.println("Elements of given array present on even position: ");  
          
        for (int i = 1; i < arr.length; i = i+2) {   
            System.out.println(arr[i]);   
        } 

        System.out.println("Elements of given array in reverse order: ");  
          
        for (int i = arr.length-1; i>=0;i--) {   
            System.out.println(arr[i]);   
        } 

        int firstele= arr[0];
        int lastele= arr[arr.length-1] ;
        System.out.println("first digit:" +firstele);
        System.out.println("last digit:" +lastele);
                 
    }  
}