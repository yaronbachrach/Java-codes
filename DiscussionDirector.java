import java.util.Random;


public class DiscussionDirector {
  public static void main(String[] args) {
    Agent agent1 = new Agent();//creating agent1 from type agent
    Agent agent2 = new Agent();//creating agent2 from type agent
    discuss(agent1, agent2);//calling the static method discuss
  }
  public static void discuss(Agent agent1, Agent agent2) {
    Random r = new Random();
    agent1 = Agent.generateAgent();//we have agent 1 with new details defined on him according to the static method methodgenerateAgent in the class Agent
    agent2 = Agent.generateAgent();//we have agent 2 with new details defined on him according to the static method methodgenerateAgent in the class Agent
   
    // We will start now all the options of our "Dialogue". We will use 5 boolean variables: x,y,z,m.n and we will randomaly select if they are true of false,
    //which allow us to get different "dialogues".
    //We will use During our dialogue different methods like getName and getCityNow and getCityBorn or getMajpr
    // on our agents(agent1, agent2) in order to fill our dialogue 
    System.out.println(agent1.getName()+": Hi there, my name is " + agent1.getName() + ". How are you?");
    boolean x = r.nextBoolean();
    if (x) {
      System.out.println(agent2.getName()+": Hi, I'm " + agent2.getName() + ", I am liitle bit tired.");
      boolean y = r.nextBoolean();
      if (y) {
        System.out.println(agent1.getName()+": Why are you so tired?");
        System.out.println(agent2.getName()+": I just got off a flight from my hometown, "+agent2.getCityBorn()+". I came for a vication."); 
        System.out.println(agent1.getName()+": Nice, I'm from "+agent1.getCityBorn()+" but I live here in "+agent1.getCityNow()+" because I go to school here, majoring in "+agent1.getMajor()+".");
        boolean z = r.nextBoolean();
        if (z) {
          System.out.println(agent2.getName()+":Really, My best friend is from "+agent1.getCityBorn()+". I have to go to catch some sleep. It was really nice speaking with you.");
        }
        else {
          System.out.println(agent2.getName()+":Really? You are from "+agent1.getCityBorn()+"?! I was there. I love this place!");
        }
      }
      else {
        System.out.println(agent1.getName()+": You are not the first one to be tired in: "+agent1.getCityNow()+". Stop complaining. Here, let me buy you a drink.");
        boolean m = r.nextBoolean();
        if (m) {
          System.out.println(agent2.getName()+": You roud. You should visit the place I am coming from, which is: "+agent2.getCityBorn()+". Maybe you will learn some manners.");
        }
        else {
          System.out.println(agent2.getName()+": I and the other students in my major,"+agent2.getMajor()+", don't like to drink usually.");
        }
        System.out.println(agent1.getName()+":Whatever, I have to go anyway. Take care");
      }
    }
    else {
      System.out.println(agent2.getName()+": I am good! Thanks for asking, "+agent1.getName()+". How are you today?");
      System.out.println(agent1.getName()+": Not so bad. So where are you from?");
      System.out.println(agent2.getName()+": I am from "+agent2.getCityBorn()+", where are you from?");
      System.out.println(agent1.getName()+": I am coming from "+agent1.getCityBorn()+".");
      boolean n = r.nextBoolean();
      if (n) {
        System.out.println(agent2.getName()+": Really! You're from "+agent1.getCityBorn()+"? Your accent does not sound like you come from "+agent1.getCityBorn()+".");
      }
      else {
        System.out.println(agent2.getName()+": So, "+agent1.getName()+" from "+agent1.getCityBorn()+". What do you do in life?.");     
        System.out.println(agent1.getName()+": I am still a student. My major is "+agent1.getMajor()+". I am sorry, but I forgat to ask your name?"); 
        System.out.println(agent2.getName()+": My name is "+agent2.getName()+", Do you want to share a drink?"); 
        System.out.println(agent1.getName()+": Sure!");                     
      }
    }
  } 
}