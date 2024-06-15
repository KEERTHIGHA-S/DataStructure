import java.util.Arrays;
class Bubblesort {
    public static void main(String[] args) {
        int a[]={10,5,2,20,4};
        System.out.println(Arrays.toString(a));//Arrays.toString can be used by                                         using util package
        for(int i=0; i<a.length-1;i++)
        {
            for(int j=0; j<a.length-1-i;j++)//in bubblesort in every next and                                  next iteration the last element is                                 sorted so it is not taken(-i)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}