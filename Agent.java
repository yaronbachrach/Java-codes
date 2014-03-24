
//import java.io.*;
import java.util.Calendar;
//import java.util.ArrayList;

import java.util.Random;


public class Agent {
  private boolean isMale;
  private String birthday;
  private int yearOfBirth;
  private String name;
  private String cityBorn;
  private String cityNow;
  private String major;

  public String getGender() {// a method to get the gender 
    if (this.isMale) {
      return "male";
    }
    else {
      return "female";
    }
  }
  public String getBirthday() {// a method to get the birthday of the agent
    return this.birthday;
  }
  public String getName() {// a method to get the name of the agent
    return this.name;
  }
  public String getCityBorn() {// a method to get the city of the agent
    return this.cityBorn;
  }
  public String getCityNow() {//a method to get the current city of the agent
    return this.cityNow;
  }
  public String getMajor() {// a method to get the major of the agent
    return this.major;
  }
  
  public void sayHello() {// a method that let my agent say hello, my dear.
    System.out.println(this.name + " says: Hello my dear.");
  }
  public void sayCityBorn() {// a method that let the agent said which city he was born.
    System.out.println(this.name + " says: I am from " + this.cityBorn + ".");
  }
  public void howOldAreYou() {// a method that calculate the agant age and let him say it.
    System.out.println(this.name + " says: I am " + (Calendar.getInstance().get(Calendar.YEAR) - this.yearOfBirth) + " years old.");
  }
  public void sayGender() {// a method that let the agent say his gender.
    System.out.println(this.name + " says: I am " + getGender() + ".");
  }
  public void sayCityNow() {// a method that let the agent say his current city.
    System.out.println(this.name + " says: I live in " + this.cityNow + ".");
  }
  public void sayMajor() {// a method that let the agent say his major.
    System.out.println(this.name + " says: I am majoring in " + this.major + ".");
  }
 
  public void whoAreYou() {// a method that summerize and print all the details are known about our agant
    sayHello();
    sayCityBorn();
    howOldAreYou();
    sayGender();
    sayCityNow();
    sayMajor();
  }
  
  public static Agent generateAgent() {
    Agent randomAgent = new Agent();
    Random r = new Random();
    randomAgent.isMale = r.nextBoolean(); //choosing if our agent is male or female by random method
    if (randomAgent.isMale) {//in case our agent is male
      try {
        WordList maleNames = new WordList("MaleNames.txt");
        randomAgent.name = maleNames.getRandomWord();// choosing a randon mane to our agent from our maleNames
      }
      catch (Exception m) { 
        randomAgent.name = "jhon"; //in case of exception we will choose jhon as our random name
        System.out.println("Exception thrown by MaleNames");
        m.printStackTrace();
      }
    }
    else {// this for case our agent is a female
      try {
        WordList femaleNames = new WordList("FemaleNames.txt");
        randomAgent.name = femaleNames.getRandomWord(); // choosing a randon mane to our agent from our femaleNames
      }
      catch (Exception f) {
        randomAgent.name = "shelly";//in case of exception we will choose shelly as our random name
        System.out.println("Exception thrown by FemaleNames");
        f.printStackTrace();
      }
    }   
   
    try {// Now, we try to choose a major to our agent
      WordList majors = new WordList("Majors.txt");//creating majors from type wordList
      randomAgent.major = majors.getRandomWord();//choosing  a random major to our agent from our majors
    }
    catch (Exception m) { 
      randomAgent.major = "Math";// In case we have an exception we will choose Math
      System.out.println("Exception thrown by Majors");
      m.printStackTrace();
    }
 
    try {// Now, we try to choose a city where the agent was born and a city where the agant currently lives.   
      WordList cities = new WordList("Cities.txt");// creating cities from the type wordList.
      randomAgent.cityBorn = cities.getRandomWord();//choosing  a random cityBorn to our agent from our cities.
      randomAgent.cityNow = cities.getRandomWord();//choosing  a random cityNow to our agent from our cities.
    }
    catch (Exception c) {
      randomAgent.cityBorn = "Montreal";// in case there is an exception we will choose Montreal as a cityBorn
      randomAgent.cityNow = "Chicago";//  in case there is an exception we will choose Chicago as a cityBorn
      System.out.println("Exception thrown by Cities");
      c.printStackTrace();
    }
    // Finally, we need to choose a random birthday
    String[] monthsOfTheYear = {"January","February","March","April","May","June","July",
      "August","September","October","November","December"};// we will create an array of string which include the list of the 12 month in a year.
    int indexMonth = r.nextInt(11);// we will randomaly choose a month from our list and store it in idexmonth from type string.
    String monthOfBirth = monthsOfTheYear[indexMonth];// we will use the number of the random month chosen, put it in our array to get the name of the month.
    String m = monthOfBirth;// we willfor convience the variable m as well
    
    int age = r.nextInt(75-15);//choosing a random age between 15 to 75
    randomAgent.yearOfBirth = (Calendar.getInstance().get(Calendar.YEAR))-age-15;
    int y = randomAgent.yearOfBirth;
    
    int dayOfBirth;
    //Now, we need make sure our date is valid date of birth
    if (m=="January" || m=="March" || m=="May" || m=="July" || m=="August" || m=="October" || m=="December") {// those months have 31 days
      dayOfBirth = r.nextInt(31);//choosing a random day of birth
    }   
    else if (m=="April" || m=="June" || m=="September" || m=="November") {//those months have 30 days
      dayOfBirth = r.nextInt(30);//choosing a random day of birth
    }
    else if (m=="February" && y==1964 || y==1968 || y==1972 || y==1976 || y==1980 || y==1984 //every 4 years in Feburary we have 29 days
               || y==1988 || y==1992 || y==1996 || y==2000 || y==2004 || y==2008 || y==2012) {
      dayOfBirth = r.nextInt(29);//choosing a random day of birth in Feburary
    }
    else {
      dayOfBirth = r.nextInt(28);//If not, we have 28 days in Feburary
    }
    randomAgent.birthday = (monthOfBirth + "" + dayOfBirth + "" + randomAgent.yearOfBirth); 
    
    return randomAgent;
  }
}