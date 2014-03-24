public class Question3 {
  public static void main(String[] args) {
    java.util.Scanner keyboardReader = new java.util.Scanner(System.in);
    System.out.println("Please enter x elipse center coordiante");
    int pos_x = keyboardReader.nextInt();
    System.out.println("please enter y elipse center coordinate");
    int pos_y = keyboardReader.nextInt();
    System.out.println("please enter the first radius of the elipse");
    int radiusA= keyboardReader.nextInt();
    System.out.println("please enter the second radius of the elipse");
    int radiusB= keyboardReader.nextInt();
    DrawMeAnEllipse(pos_x,pos_y,radiusA,radiusB);
   
    
  }
  
    public static void DrawMeAnEllipse(int posx, int posy, int radiusA, int radiusB)
    {
      for (int y=0; y<20; y++){
        for (int x=0; x<20; x++){
          double error= (0.05*((radiusA+radiusB)/2));
          // error is defined as 22% from the average of the 2 radii.
          // Important: This error value can be mimized up to 5% in some cases to achive better results 
          boolean a=((double)(x-posx)/radiusA)*((double)(x-posx)/radiusA) + ((double)(y-posy)/radiusB)*((double)(y-posy)/radiusB)>=1-error;
          // a is a variable that returns true if the equation is bigger than 1-error
          boolean b=((double)(x-posx)/radiusA)*((double)(x-posx)/radiusA) + ((double)(y-posy)/radiusB)*((double)(y-posy)/radiusB)<=1+error;
          // b is a variable that returns true if the equation is bigger than 1+error      
          if (a && b ) 
                System.out.print("#");
           
           else 
                 System.out.print(" ");
           
      }
      System.out.println();
      }
           
    }
  } 