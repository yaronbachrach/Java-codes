public class Question2 {
  public static void main(String[] args) {
    System.out.println("Please enter the position of x");
    java.util.Scanner keyboardReader = new java.util.Scanner(System.in);
    int pos_x = keyboardReader.nextInt();
    System.out.println("please enter the position of y");
    int pos_y = keyboardReader.nextInt();
    System.out.println("please enter the radius of the circle");
    int radius= keyboardReader.nextInt();
    DrawMeACircle(pos_x,pos_y,radius);
  }
  
    public static void DrawMeACircle(int posx, int posy, int radius)
    {
      for (int y=0; y<20; y++){
        for (int x=0; x<20; x++){
           if  ((((x-posx)*(x-posx) + (y-posy)*(y-posy))>
  ((radius*radius)*0.8)) && (((x-posx)*(x-posx) + (y-posy)*(y-posy))< (radius*radius)*1.2)){
             // The 2 inqualities check if the equation is between (0.8*r^2) to (1.2*r^2).
             // 0.2r^2 is our error in order to relax our circle   
             System.out.print("#");
           }
           else {
                 System.out.print(" ");
           }
      }
      System.out.println();
      }
           
    }
  } 
