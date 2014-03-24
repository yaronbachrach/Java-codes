public class Question1{
  public static void main(String[] args) {
    System.out.println("Please enter a string or number and I will check if it consecutive for you");
    java.util.Scanner keyboardReader = new java.util.Scanner(System.in);
    
    String str = keyboardReader.nextLine(); 
    System.out.println(str.charAt(1));
    System.out.println(isConsecutive(str));  
  }
  
  public static boolean  isConsecutive(String str)  {
    str = str.toLowerCase(); 
    boolean a=true;// a is a variable thay checks if the the string or the number is decreasing or not
    boolean b=true;// b is a variable thay checks if the the string or the number is increasing or not                                         
    for (int i=0; i<=str.length()-2; i++){
      boolean m=((str.charAt(i)-1)==(str.charAt(i+1)));//m is a variable that checks if the string or the number is decreasing or not
      boolean n= ((str.charAt(i)=='0') && (str.charAt(i+1)=='9'));//n is a variable that checks if there is loop in the decreasing number
      boolean k= ((str.charAt(i)=='a') && (str.charAt(i+1)=='z'));// k is a variable that checks if there is loop in the decreasing string
      
      if ( (m==false) && (n==false)&& (k==false) )
        a=false;
        }
    
    
    for (int i=0; i<=str.length()-2; i++){
      boolean m=(str.charAt(i)+1==str.charAt(i+1));//m is a variable that check if the string or the number is increasing or not
      boolean n= ((str.charAt(i)=='9') && (str.charAt(i+1)=='0'));//n is a variable that checks if there is a loop in the increasing number
      boolean k= ((str.charAt(i)=='z') && (str.charAt(i+1)=='a'));// k is a variable that checks if there is a loop in the increasing string
      if ( (m==false) && (n==false)  &&  (k==false))
          b=false;
    }
    if ((a==false)&&(b==false))
      return false;
    return true;
   
  }
}


