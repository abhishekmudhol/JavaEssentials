package javaBasic_01;


class student {
 
    int rollNo;
    String name;
    
}

public class java4 {

     public static void main(String[] args) {
        
        student s1 = new student();
        s1.rollNo = 500;
        s1.name= "ram";

        student s2 = new student();
        s2.rollNo = 501;
        s2.name= "bharat";

         student s3 = new student();
        s3.rollNo = 502;
        s3.name= "kiran";

        // print the s1 object
          System.out.println(s1); //student@28a418fc

         // creating array  that hold students references

        
         student stud[] = new student[3];
         stud[0] = s1;
         stud[1] = s2;
         stud[2] = s3;

         for (int i = 0; i < stud.length; i++) {
              System.out.println(stud[i].rollNo);
                }

        //  Enhanced for loop used with array or array type of   data

           for(student n : stud){

                   System.out.println(n.name); // ram
                                               // bharat
                                               // kiran
                  
           };

     //Enhanced for loop is called forEach becuz it seem like
     // forEach in other lang  java8 have forEach method  
 


     }

}
