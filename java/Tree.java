import java.util.Scanner;

class Tree
{
       public static void main(String[] args) {
        int ar[]=new int [100];
        System.out.println("enter any range ");
        Scanner obj=new Scanner(System.in);
        int b;
         b=obj.nextInt();
        int a;
        for( a=0;a<=b;a++)
        {
             ar[a]=a;
             System.out.print(ar[a]+"+");
        }

System.out.println("=");
{
    int c=0;
    for(a=0;a<=b;a++)
    {
 c=c+ar[a];
 
    }
    System.out.println(c);
}
    }
}