package javaBasic_01;
 

            
  class Calc{
           
            int x;
            int z;

      int add(int a ,int b){

            return  a+b;
      }
      
}

public class java1 {
    public static void main(String[] args) {

          Calc obj = new Calc ();  //obj is reference variable 

          int result = obj.add(1, 1);

          System.out.println(result);
    }
}

