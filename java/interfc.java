 interface iunterfc {
    public static final int a=10;
    int b=9;
    void fub();
}
 interface ray extends iunterfc
{
    static void fun();
    
        
    
}
class interfc
{
    public static void main(String[] args) {
       ray.fun();
       System.out.println(iunterfc.a) ;

    }
}
