// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class BinarySearch{
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        System.out.println("Enter the number to find:");
        Scanner sc=new Scanner(System.in);
        int key = sc.nextInt();
        
        int lb=0;
        int ub=a.length-1;
        int flag=0;
        
        while(lb<=ub)
        {
            int mid=(lb+ub)/2;
            if (a[mid]==key)
            {
                System.out.println("Item found at the location\t" + mid +"\tItem is\t" + a[mid]);
                flag=1;
                break;
            }
             else if (a[mid]<key)
             {
                 lb=mid+1;
             }
             else
             {
                 ub=mid-1;
             }
        }
        if(flag==0)
        {
            System.out.println("Not found");
    }
}
}