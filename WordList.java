import java.util.ArrayList;
import java.io.*;
import java.util.Random;

public  class WordList
{
    private ArrayList<String> words;//private variable words from type arrayList<String>
    private static Random r = new Random();//
    public static void main(String[]args)
    {
      
      try
      {
        WordList a =new WordList("Majors.txt");// creating the object a fron type wordlist by calling the constructor  
        
        System.out.println("Random word: " + a.getRandomWord());
       
      }
    
      catch(Exception e)//If there is an exception it will catch it in here
      { 
       System.out.println(e);
      }
    }
    
      public WordList (String filename) throws IOException// the consructor
      {
           words = new ArrayList<String>();
           FileReader fileReader = new FileReader(filename);//reading the file
           BufferedReader in = new BufferedReader(fileReader);//use filereader to create the object in of type BufferReader
           int i=0;
          
           while (true)//as long as we still have words to read
           {
             String s = in.readLine(); //get the line from the file and store it in s
             if (s==null)//if s is empty
             {
               break;// go out from the constructor
             }
            
             words.add(s);// add s to the object words

            //  System.out.println(words);
             i++;
           }
           in.close();// closing the file and we can use it again in the future
    }
      public String getRandomWord() 
      {
        //r.nextInt();
        
        return words.get(r.nextInt(words.size()));// by using the variable r from type random we return a random word from our arrayList (words) betewwn 0
                                                  // to the place words.size-1 in our arrayList words
      }
 }


