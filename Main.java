/* 
   Name: Maroof Sulaiman
   Date: July 10, 2024
   Purpose of program: To create a text based adventure game using if and nested if statements with at least 5   
  levels of nesting and proper organization of code as well as programming style. 
 */
import java.util.Scanner;   //Import Scanner object

public class Main {
  public static void main(String[] args) {
    Scanner keyedInput =  new Scanner(System.in);   //Instantiate scanner object

    String userInput;
    
    //Welcome and introduction to the game
    System.out.println("Welcome to 'Lights out', a text based adventure game!");
    System.out.println("");
    //Background and Question 1
    System.out.println("Your name is Captain Bill Locke. You and your crew were en route to a suspicious celestial body when the ship was boarded by aliens the power has gone out. You fumble around the cockpit for the safety kit and find your flashlight. It cuts a beam of light through the darkness and you make your way to the hallway. You need to get to the electrical room to try and access the breaker panel, at some point after being boarded, you hit your head and you are unsure of how to get there. The hallway splits into two paths, there are noises from the left path. Do you want to go left or right? ('L' = Left, 'R' = Right)");
    userInput = keyedInput.nextLine();

    //Question 1 if statement (Options)
    if (userInput.equals("L") || userInput.equals("l"))
    {
    //Question 1 = True
      System.out.println("You choose to go left and make your way down the hallway where you find another beam of light... coming from a flashlight held by an alien! Do you want to fight the alien or run away? (Type 'F' for fight or 'R' to run)");
      userInput = keyedInput.nextLine();
      //Question 1 = True branch --> Question 2 if statement (Options)  
      if (userInput.equals("F") || userInput.equals("f"))
        {
          //Question 2 = True
          System.out.println("You run at the alien and slide under its legs. Once behind it, you grip the flashlight and hit the alien as hard as you can. The Titanium casing of the flashlight is enough to put the alien to rest. Composing yourself, you reach the end of the hallway where you can go up a ladder or continue to another hallway on your left. (Type 'U' to go up the ladder or 'L' to go left)");
          userInput = keyedInput.nextLine();
            //Question 2 = True branch --> Question 3 if statement (Options)
            if (userInput.equals("U") || userInput.equals("u"))
            {
              //Question 3 = True
              System.out.println("You go up the ladder and at the top, again see a beam of light. You poise yourself, ready to attack, but as the flashlight comes closer, you realize that its held by another crewmate! Your crewmate offers you spare bandages but they are extra baggage. Do you want to take them? (Type 'Y' to take them or 'N' to leave them)");
              userInput = keyedInput.nextLine();
                //Question 3 = True branch --> Question 4 if statement (Options)
                if (userInput.equals("N") || userInput.equals("n"))
                {
                  //Question 4 = True
                  System.out.println("You leave the bandages and together you continue on. Your crewmate says he knows the way to the electrical room and asks you to follow him. In a sudden recollection you remember a training you attended a year ago where you were taught that these aliens can shapeshift and you become suspicious. Do you follow your crewmate? (Type 'Y' to follow them or 'N' to leave them)");
                  userInput = keyedInput.nextLine();
                    //Question 4 = True branch --> Question 5 if statement (Options)
                    if (userInput.equals("N") || userInput.equals("n"))
                    {
                      //Question 5 = True
                      System.out.println("You politely refuse and as you look at your 'crewmate' realize that you haven't seen anyone with that nametag aboard ship. In that moment you realize that your intuition was right and you push your 'crewmate' down a nearby laundry shoot and watch as they shapeshift back into an alien and fall down the long hatch. Breathing heavily, you continue on down the hallway and reach a door. You could spend 2 minutes in the open trying to pick the lock or go down a dark hatch to your right. Do you want to pick the lock or go down the hatch? (Type 'P' to pick the lock or 'H' to go down the hatch)");
                      userInput = keyedInput.nextLine();
                        //Question 5 = True branch --> Question 6 if statement (Options)
                        if (userInput.equals("P") || userInput.equals("p"))
                        {
                          //Question 6 = True
                          System.out.println("You spend a long two minutes in the open trying to pick the lock. When it finally clicks open, you realize that, to your surprise, you have found the electrical room. You reset the breaker panel and the lights come on. After making a ship wide all-call using the speaker system in the electrical room, you regroup with your crewmates in the emergency shelter and signal the Space Guard for help. You are safe until they arrive and have saved you and your crew. You have survived! Game over.");
                          System.out.println("");
                          System.out.println("Thank you for playing Lights out!");
                          System.exit(0);
                        }
                        else
                        {
                          //Question 6 = False
                          System.out.println("You decide to go down the hatch and walk over to it. You bend over and in one quick motion, open the trapdoor and slide in before the door bangs shut above you. You fall for 2, 3, 4 seconds and in horror realize that you are going to die as you keep falling. 9 seconds later, you hit the base of the ship's loading dock. You feel no pain, you die. Game over.");
                          System.out.println("");
                          System.out.println("Thank you for playing Lights out!");
                          System.exit(0);
                        }
                    }
                    else
                    {
                      //Question 5 = False
                      System.out.println("You follow your crewmate for a while and your suspicions begin to dissolve. All of a sudden when you least expect it, you run into your 'crewmate' who has turned around to face you.. and has shifted back into their alien form. You stumble back in horror but the alien reaches out and you feel yourself being shoved to the side. Your head hits the wall and your vision goes dark. You die, game over.");
                      System.out.println("");
                      System.out.println("Thank you for playing Lights out!");
                      System.exit(0);
                    }
                }
                else{
                  //Question 4 = False
                  System.out.println("You accept your crewmates' offer and stow the bandages away. As you lean in to take the bandages from their hand, you notice their nametag. You have never seen this name aboard your ship before. In a sudden recollection you remember a training you attended a year ago where you were taught that these aliens can shapeshift and you become suspicious. Your crewmate says that they know the way to the electrical room and asks you to follow them. Do you follow your crewmate? (Type 'Y' to follow them or 'N' to leave them)");
                  userInput = keyedInput.nextLine();
                    //Question 4 = False branch --> Question 5 if statement (Options)
                    if(userInput.equals("Y") || userInput.equals("y"))
                    {
                      //Question 5 = True
                      System.out.println("You decide to follow your crewmate anyway and together continue on down the hallway until you reach a room. 'Ship service tunnel access' is printed above the door. You push the door open and enter but as you pan your flashlight around the room you hear a soft click behind you. Alerted, you turn around to see an alien staring back at you threw the viewing glass in the door, a door that was now locked from the outside. Terrified, you look around for a way out when you notice a sign on one wall labelled 'Service tunnel access codes' and on the other side of the room, a service tunnel labelled 'Electrical room'. First, you go to the sign and find the Electrical room code: 2103. Then, as you make your way to the service tunnel, you notice two glistening eyes in the darkness. You run to the service tunnel and rush to put in the code... the code! You frantically try to recall the code and as the alien looms closer, you put in:___ (Type the code out. Ex '1234', then press Enter) ");
                      userInput = keyedInput.nextLine();
                        //Question 5 = True branch --> Question 6 if statement (Options)
                        if(userInput.equals("2103"))
                        {
                          //Question 6 = True
                          System.out.println("You have good memory, with quick hands you type in the code and squeeze into the tight tunnel, safe from the alien which is too big to fit. You crawl to the end and find a hatch that drops down into the electrical room. Using the bandages as a sort of rope, you lower yourself slowly into the electrical room. You reset the breaker panel and the lights come on. After making a ship wide all-call using the speaker system in the electrical room, you regroup with your crewmates in the emergency shelter and signal the Space Guard for help. You are safe until they arrive and save you and your crew. You have survived! Game over.");
                          System.out.println("");
                          System.out.println("Thank you for playing Lights out!");
                          System.exit(0);
                        }
                        else
                        {
                          //Question 6 = False
                          System.out.println("You try to recall the code but your memory is fuzzy and as you finish typing it in, nothing happens. The alien reaches your position and your vision goes dark. You die, game over.");
                          System.out.println("");
                          System.out.println("Thank you for playing Lights out!");
                          System.exit(0);
                        }
                    }
                    else
                    {
                      //Question 5 = False
                      System.out.println("You politely refuse and watch your crewmate turn their head 180 degrees to look back at you. In that moment of horror, you realize that your intuition was right and you push your 'crewmate' down a nearby laundry shoot and watch as they stumble on the edge. Just as you begin to think you are safe, you feel a tug at your waist and see the alien holding onto the edge of the bandage roll from earlier. You are yanked along with the alien and together, fall to the bottom of the tall hatch. You die, game over.");
                      System.out.println("");
                      System.out.println("Thank you for playing Lights out!");
                      System.exit(0);
                    }
                }
            }
            else
            {
              //Question 3 = False
              System.out.println("You go down the hallway to your left and see a special access stairwell that says 'To electrical room' above it. Only some people aboard ship have the keys to special access pathways. As the captain, you are one of these people. You fumble around your back pocket for your key bunch and after a painful minute in the dark, unlock the door and climb the stairwell. At the top of the stairwell, you reach the electrical room. You reset the breaker panel and the lights come on. After making a ship wide all-call using the speaker system in the electrical room, you regroup with your crewmates in the emergency shelter and signal the Space Guard for help. You are safe until they arrive and save you and your crew. You have survived! Game over");
              System.out.println("");
              System.out.println("Thank you for playing Lights out!");
              System.exit(0);
            }
        }
        else
        {
          //Question 2 = False
          System.out.println("You turn around and try to run back down the hallway but another alien blocks your path. You are overwhelmed by the two aliens and are unable to fight them both. You die, game over.");
          System.out.println("");
          System.out.println("Thank you for playing Lights out!");
          System.exit(0);
        }
    }
    else
    {
      //Question 1 = False
      System.out.println("You go right and find a wrench which you pick up. After a while, you find an injured crewmate. You could help tend to their wounds or leave them and continue on. Do you want to help them? (Type 'Y' to help or 'N' to continue without them)");
      userInput = keyedInput.nextLine();
      //Question 1 = False branch --> Question 2 if statement (Options)
        if (userInput.equals("Y") || userInput.equals("y"))
        {
          //Question 2 = True
          System.out.println("You help your crewmate and they tell you that they know the way to the electrical room. Together, you make your way through the ship and eventually come to a door with a dual lock system. You need to hold the door handle down and scan your hand but the door handle is jammed. You can use the wrench to force the door handle down but you need both hands to do so and thus cannot trigger the hand scanner at the same time. Luckily, you have your friend with you and they scan their hand while you force the door handle down with the wrench. The door opens and you realize that you've entered the back door to the electrical room. You reset the breaker panel and the lights come on. After making a ship wide all-call using the speaker system in the electrical room, you regroup with your crewmates in the emergency shelter and signal the Space Guard for help. You are safe until they arrive and save you and your crew. You have survived! Game over.");
          System.out.println("");
          System.out.println("Thank you for playing Lights out!");
          System.exit(0);
        }
        else
        {
          //Question 2 = False
          System.out.println("You decide to continue on without them and reach a ladder which you go up. At the top of the ladder, there is closed door with a dual lock system. You need to hold the door handle down and scan your hand but the door handle is jammed. You can use the wrench to force the door handle down but you need both hands to do so and thus cannot trigger the hand scanner at the same time. As you try to figure this out, you hear footsteps coming up the rungs of the ladder. You try to smash your way through the door but it is too late, you turn around and see the crewmate you passed earlier. The last thing you see is their fist holding a metal rod which connects against the side of your head and then your vision goes black. You die, game over.");
          System.out.println("");
          System.out.println("Thank you for playing Lights out!");
          System.exit(0);
        }
    }

    keyedInput.close();   //Close scanner object
    
  }


}