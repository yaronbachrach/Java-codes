import java.util.Arrays;

public class SearchComparison{
  public static void main(String[]args){
   for (int n=10; n<500000000; n=n*2){
       StopWatch watch = new StopWatch();
       watch.start();  //setting the time before by calling start on watch.
       int[] a= ArrayUtilities.generateRandom(n);//We generate an array ?lled with random values of size n storing in array called a.
       watch.stop();  //setting the time after by calling stop on watch.
       long timeGenerateArray=watch.getTimeMicro();
        //The time the action took will be stored in timeGenerateArray variable after getting this value from calling getTimeMicro method on watch
       
       watch.start();   //setting the time before by calling start on watch.
       ArrayUtilities.linearSearch(a,-1);   // Searching for the number -1 in the array using the linearSearch static method from the class ArrayUtilities
       watch.stop();   //setting the time after by calling start on watch.
       long timeLinearSearch=watch.getTimeMicro();
        //The time the action took will be stored in timeLinearSearch variable after getting this value from calling getTimeMicro method on watch
       
       watch.start();     //setting the time before by calling start on watch.
       int[] b= ArrayUtilities.copy(a);  // duplicate the array and storing it into a new array variable
       watch.stop();     //setting the time after by calling start on watch.
       long timeDuplicate=watch.getTimeMicro();
       //     The time the action took will be stored in timeDuplicate variable after getting this value from calling getTimeMicro method on watch
       
      
       long timeBubbleSort; //defining a long variable timeBubbleSort
       if (n<100000)
       {
            watch.start();
            ArrayUtilities.sort(a);// sort the array a by calling the method sort in the class ArrayUtilities
            watch.stop();
            timeBubbleSort=watch.getTimeMicro();
            // The time the action took will be stored in timeBubbleSort variable after getting this value from calling getTimeMicro method on watch
       }
       else
         {
             timeBubbleSort=0;
         }
      
           watch.start();
           Arrays.sort(b); // Calling the library method arrays.sort with the input the duplicated array b   
           watch.stop();   
           long timeLibrary=watch.getTimeMicro();
             //  The time the action took will be stored in timeLibrary variable after getting this value from calling getTimeMicro method on watch
       
  
       
      // System.out.println(timeLibrary);
       
       watch.start();
       ArrayUtilities.binarySearch(a,-1);//  Searching the value -1 by calling the method binarySearch on the class ArrayUtilities
       watch.stop();
       long timeBinarySearch=watch.getTimeMicro();
       //  The time the action took will be stored in timeBinarySearch variable after getting this value from calling getTimeMicro method on watch
       
       
       System.out.println(n+","+timeGenerateArray + "," +timeLinearSearch+","+timeDuplicate+","+timeBubbleSort +","+timeLibrary+","+timeBinarySearch);
  
   }
       
    
  }
  
  
}
