public class StopWatch {
 private static long startTime;// StartTime is a privat variable which is designed for private use in the class stopWatch.  
 private static long stopTime;//   StopTime is a privat variable which is designed for private use in the class stopWatch.
  public static void main(String[]args)
  {
   
         StopWatch watch = new StopWatch();
          watch.start();// start is a non static method which be activated on the instance watch. 
         for (int i = 0; i < 100; i++) 
         { 
           System.out.println("I’m going to test how fast it is to print this 100 times");
         }
               watch.stop();
               System.out.println("It took " + watch.getTimeNano() + " Nanoseconds to complete that task");
               System.out.println("It took " + watch.getTimeMicro() + " Microseconds to complete that task");
               System.out.println("It took " + watch.getTimeMilli() + " Milliseconds to complete that task");
               System.out.println("It took " + watch.getTimeSeconds() + " seconds to complete that task");
               
    
  }
    public void start()// start is a non static method to set the start time
      {
      startTime=System.nanoTime();//we will get a start time. we can use this private variable in the all class because it's defined in the class.
      }
    public void stop()//stop is a non static method to set the stop time.
    {
      stopTime=System.nanoTime(); //we will get a stop time. we can use this private variable in the all class because it's defined in the class.
    }
    public long getTimeNano()//getTimeNano is private method for finding the difference in time between stopTime to startTime
    {
      long x=stopTime-startTime;
     // System.out.println("the difference in nano seconds is"+x);
      return x;
     }
    public long getTimeMicro()//getTimeMicro is a non static method for claculating the difference in times in microSeconds
    {
      long x=getTimeNano()/1000;//it's doing so by calling getTimeNano and devides it by 1000.
      return x;
    }
    public long getTimeMilli()//getTimeMilli is a non static method for claculating the difference in times in MilliSeconds.
    {
      long x=getTimeMicro()/1000;//it's doing so by calling getTimeMicro and devides it by 1000.
     return x;  
    }
    public long getTimeSeconds()//getTimeSeconds is a non static method for claculating the difference in times in Seconds.
    {
      long x=getTimeMilli()/1000;//it's doing so by calling getTimeMilli and devides it by 1000.
      //System.out.println("the difference in seconds is"+x);
      return x;    
    }
    
}