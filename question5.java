import java.util.Scanner;

public class question5
{
   public static void main(String args[])
   {
       int row, col, i, j;
       int arr[][] = new int[100][100];
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter row for the array : ");
       row = scan.nextInt();
       System.out.print("Enter column for the array : ");
       col = scan.nextInt();
       System.out.println("Enter " +(row*col)+ " Array Elements : ");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
              int u = scan.nextInt();
              if(u<=99){
               arr[i][j] = u; 
              }
              else{
                System.out.println("ERROR, Input value should not be greater than 2 digit.");
                System.out.println("Re enter the no");
                arr[i][j]  = scan.nextInt(); 
              }
           }
       }
       System.out.print("The Array is :\n");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               System.out.print(arr[i][j]+ "  ");
           }
           System.out.println();
       }
       System.out.print("New array after multiplication odd no by 2 is : ");
       System.out.println();
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
            if((arr[i][j] % 2) != 0)
              arr[i][j]=arr[i][j]*2;
               System.out.print(arr[i][j]+ " ");
           }
           System.out.println();
       }
   }
}