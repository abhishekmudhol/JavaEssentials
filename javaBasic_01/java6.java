package javaBasic_01;


public class java6 {
    public static void main(String[] args) {
        


      // int , boolean , float , double , char => start with small letter
      //  String =>  start with a capital letter
  
 //  IMPORTANT -> hence String is class in java not primitive type    
 //    As String is class so it has method like charAt()
          

          String a = new String();
          System.out.println(a);// blank 

          String b = new String ("ram");
          System.out.println(b);//ram
          System.out.println(b.hashCode()); // 112670

          System.out.println("hello " + b); // hello ram
          System.out.println(b.charAt(1));// a 
          System.out.println(b.concat("     bharat")); // ram     bharat

/************************************************************ */

           String simp = "ram"; // not need of write new here it done behind the sences it creates objects
 


    }
}
