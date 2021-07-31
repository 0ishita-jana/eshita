public class stat {
    void fun()
    {
       public static  final int a=10;
        int b=20;
        System.out.println(a);
        System.out.println(b);
         a++;
        b++;
    }
    public static void main(String[] args) {
        stat obj=new stat();
        stat obj1=new stat();
        obj.fun();
        obj1.fun();
    }
    
}
