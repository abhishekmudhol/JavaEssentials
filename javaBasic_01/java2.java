package javaBasic_01;



// class computer {


//     int pen;
//     String getPen( int pen){
//          return "pen";
//     }
// }

public class java2 {

    public static void main(String[] args) {
   
      int[] arr = {1,2,3,54,56};

      int[] arr1;

      int[] arr2 = new int[4];
       
      // System.out.println(arr1.length); //Error arr1 is not initialized
          
     for (int i = 0; i < arr2.length; i++) {
           // System.out.println(arr2[i]);
     }

     int[][] mdarr = new int[4][4] ; // [rows][columns]


          System.out.println(mdarr.length); //      
            // for (int i = 0; i < 4; i++) {


            //     for (int j = 0; j < 4; j++) {
            //          System.out.println(mdarr[i][j]);
            //     }             

            //   
            
            

//  Enhanced for loop concept

// for(int n[] : mdarr){

//   for(int m : n){
//     System.out.print(m + " ");
//   }    
//   System.out.println();
// }

//    IMPORTANT->   jagged array


int[][] mdarr1 = new int[4][] ; // we dont known number of columns i.e. inner array length is variable

// specify length of every array individually
mdarr1[0] = new int[4];
mdarr1[1] = new int[4];
mdarr1[2] = new int[5];
mdarr1[3] = new int[5];

           for (int i = 0; i < mdarr1.length; i++) {


                for (int j = 0; j <  mdarr1[i].length ; j++) {
                       mdarr1[i][j] = (int)(Math.random()*10);
                }             
           }
               
         
        for (int n[]: mdarr1) {
             for(int m : n){
                 System.out.print(m +" ");
             }   
             System.out.println();
        }
              
    










    
}  
}