import java.util.*; 
  
class question4
{ 
 static int frequency(int[] arr,int n, int key) 
    { 
      
         int count = 0; 
        for (int i=0; i < n; i++) 
        if (arr[i] == key)  
            count++; 
        return count;
    }
 public static void main(String []args) 
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
         System.out.println("Enter the element of whose frequency you want to count : ");
         int key = sc.nextInt();
         int n=arr.length;
         System.out.println("The Frequency Of " + key + " is : " + frequency(arr,n,key)); 
    }
}
}