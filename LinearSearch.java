import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        int a[]={10,5,2,20,4};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value to search:");
        int key=sc.nextInt();
        
        int flag=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                System.out.println("Found" +a[i]);
                flag=1;
                break;
            }
        }
        if (flag==0)
        {
            System.out.println("Value not found");
       
    }
}
}