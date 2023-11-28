import java.util.Scanner;
class Bubblesort
{
    int n,a[];
    Bubblesort(int p)
    {
        n=p;
        a=new int [n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void sorting()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
class Insertionsort
{
    int n,a[];
    Insertionsort(int p)
    {
        n=p; a=new int [n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){ a[i]=sc.nextInt();
        }
    }
    void sorting()
    {
        for(int i=1;i<n;i++)
        {
            int k=a[i];
            int j=i-1;
            while(j>=0 && (a[j]>k))
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=k;
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
public class WrapperBubbleSort
{
    public static void main(String[] args)
    {
        Bubblesort o1=new Bubblesort(5);
        System.out.println("Before bubble sort:");
        o1.display();
        o1.sorting();
        System.out.println("After bubble sort:");
        o1.display();
        Insertionsort o2=new Insertionsort(5);
        System.out.println("Before insertion sort:");
        o2.display();
        o2.sorting();
        System.out.println("After insertion sort:");
        o2.display();
    }
}

