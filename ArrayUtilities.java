import java.util.Random;

public class ArrayUtilities
{
  public static void main(String[]args)
    {

    //int[] array=new int[7];
   // int[] array={1,2,3,4,5,8};
    //intbbubbleSort;
    //ArrayUtilities e=new ArrayUtilities();
    //binarySearch(array,6);
   // e.bbubbleSort(array);
    //for (int i=0; i<array.length; i++)
     //  System.out.println(array[i]);
    char x='a';
    System.out.println((int)x);
    
    }
  public static boolean linearSearch(int[] array, int target)
  {
  //This method should take as input an array of int as well as an int.
  //This method should return true if the element target is present in array and false if it isn't present. 
    
     boolean check=false;
    for (int i=0; i<array.length; i++)
      if (array[i]==target)
            check=true;
    return check;  
  }
  public static boolean binarySearch(int[] array, int target)
  {
    // This method should take as input a sorted array of int as well as an int. 
    // Like the above method, it should return true or false based on whether the element target is present in array or not.
    //However, this time we will search it in more advance way.
     int left=0; // left will be the index of the left variable in our array
     int right=array.length; //right will be the index of the right variable in our array
     int middle=((right+left)/2);// Middle will be the index of the variable that will be in the middle of the array.
                                
                               
     while (left<=right)// 
     {
         if (array[middle]==target)//this to check if we find target in our array. If so, we stop the method and return true.
            return true;
         if (array[middle]<target)// This is to check if our target is to the right(bigger) of our variable middle 
            left=middle+1;      //If so, we will move the left variable to be  middle plus one   and then we will eliminate the right half of the array
          else
               right=middle-1;     //If no, we wiil move the right variable to be middle minous one and then we will eliminate the left half of the array.
     //System.out.println(array[middle]);
        middle=(right+left)/2; //we wiil change middle to be in the middle of our new right and left
                                 // we will continue this while loop until either return true or until right and keft will be bigger or equal to right
  }  
  
      return false; // we will return false if we went out from the while loop and didn't find a our taget variable in the array.
  }
     public static int[] copy(int[] array)
     {
       // This method should take as input an array and it should duplicate it before returning the duplicate
       int[] b=new int[array.length];
       for (int i=0; i<array.length; i++)
           b[i]=array[i];
       return b;
     }
     
     public static int[] bubbleSort(int[] array)
     {
       //This method should take as input an unsorted array and it should sort it in increasing order
       for (int i=0; i<array.length; i++)
          for (int j=i+1; j<array.length; j++)
             if (array[i]>array[j])
        {
               int help=array[i]; // we will sort this array using help variable to store array[i] for temporary use.
               array[i]=array[j];// Then, array[i] can get array[j] in order to swap.
               array[j]=help;// To complete the swap, array[j] will get the value of help(that was array[i] before the swap.
               /* we wiil continue to check and compare in 2 for loops such that every time
                the bigger loop moves from i equal 0,1,2,3 we set the first value, second, third and so on of our sorted array*/
        }
       return array;// Now, we can return the sorted array.
      
     }

     public static int[] sort(int[] array)
     {
         //I am using this just for convience that you can call either sort or bubble sort as you wish. I used this after consulation with Jonathan
         return bubbleSort(array);
     }
      
     public static int[] generateRandom(int n)
       {
         // This method should take as input an int n and generate an array of size n.
          Random r = new Random(1);
          int[] a=new int[n];
          for(int i=0; i<n; i++)
            a[i]=r.nextInt(Integer.MAX_VALUE);/* nextInt is a non static method activated on the object r from type Random. 
             * The method will get a randon number between 0 to max value in java and assigned it in to place a[i]*/ 
         return a;
       }
  public void bbubbleSort(int[] array) {
     int n = array.length;
     boolean madeSwap = true;
     while(madeSwap) {
           madeSwap = false;
           //Scanning           
           for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j+1] ) {
                     //Swapping                     
                     int temp = array[j];
                     array[j] = array[j+1];
                     array[j+1] = temp;
                     madeSwap = true;
                }
           }
     }
}

     
     
}



  
  
  