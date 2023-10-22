// IMPORTANT => ONLY inner class CAN BE static NOT outer class


class Outer 
{

    int age;

    public void show()
    {
        System.out.println("show()");
    }

    static class Inner  // inner class is static
    {
        public void config()
        {
            System.out.println("config()");
        }
    }
}

public class _29_staticInnerClass
{
    public static void main(String[] args) 
    {
        Outer obj1 = new Outer();
            obj1.show();


        //Outer.Inner obj2 =  obj1.new Inner();

        Outer.Inner obj2 =  new Outer.Inner();  // when we have inner class as static we not need object of outer class ,we can directly refer using Outer.Inner 
                                                
            obj2.config();
    }
}