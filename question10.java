import java.util.*;
class question10
{
public static void main(String args[])
{
int flag=0;
int j,k;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int m;
m=sc.nextInt();
String[] arr=new String[m];
System.out.println("enter the words");
for(int i=0;i<m;i++)
{
arr[i]=sc.nextLine();
}
for(j=0,k=m-1;j<m/2;j++,k--)
{
 if(arr[j]!=arr[k])
 {
 flag=1;
 break;
 }
 else
 ;
}
if(flag==1)
{
System.out.println("strings are not palindrome");
}
else
{
System.out.println("Strings are palindrome");
}
 }
}