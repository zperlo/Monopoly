import java.util.Scanner;
import java.util.Random;

public class game {
   int numPlayers;
   int currPlayer = 0;
   player[] players;
   property[] properties;
   int freePark = 0;
   
   game(int numP, player[] players, property[] properties){
      this.numPlayers = numP;
      this.players = players;
      this.properties = properties;
   }
   
   void nextTurn(){
      Scanner stdin = new Scanner(System.in);
      String expression;
      if(currPlayer < (numPlayers - 1))
         currPlayer++;
      else currPlayer = 0;
      while(players[currPlayer].alive == 0){
         if(currPlayer < (numPlayers - 1))
            currPlayer++;
         else currPlayer = 0;
      }
      System.out.println("It's " + players[currPlayer].name + "'s turn!");
      checkMoney();
      System.out.println("You have $" + players[currPlayer].money);
      //offer chance to buy houses if they have a monopoly
      //Purple Monopoly
      if(currPlayer == properties[1].owner && currPlayer == properties[3].owner){
         System.out.println("You have a monopoly on " + properties[1].color + ", would you like to buy houses/hotels? Type 'y' to buy houses, or 'n' to skip");
         expression = stdin.nextLine();
         if(expression.equals("y")){
            System.out.println("Which would you like to buy houses on? Type the name of the property (" + properties[1].name + ", or " + properties[3].name + ")");
            expression = stdin.nextLine();
            howManyHouses(1, expression);
            howManyHouses(3, expression);
            System.out.println("Would you like to buy houses on any other " + properties[1].color + " properties? If so, type the name of the property, if not, type 'n'");
            expression = stdin.nextLine();
            if(!expression.equals("n")){
               howManyHouses(1, expression);
               howManyHouses(3, expression);
            }
         }
      }
      
      //Light Blue monopoly
      if(currPlayer == properties[6].owner && currPlayer == properties[8].owner && currPlayer == properties[9].owner){
         System.out.println("You have a monopoly on " + properties[6].color + ", would you like to buy houses/hotels? Type 'y' to buy houses, or 'n' to skip");
         expression = stdin.nextLine();
         if(expression.equals("y")){
            System.out.println("Which would you like to buy houses on? Type the name of the property (" + properties[6].name + ", " + properties[8].name + ", or " + properties[9].name + ")");
            expression = stdin.nextLine();
            howManyHouses(6, expression);
            howManyHouses(8, expression);
            howManyHouses(9, expression);
            System.out.println("Would you like to buy houses on any other " + properties[6].color + " properties? If so, type the name of the property, if not, type 'n'");
            expression = stdin.nextLine();
            if(!expression.equals("n")){
               howManyHouses(6, expression);
               howManyHouses(8, expression);
               howManyHouses(9, expression);
               System.out.println("Would you like to buy houses on any other " + properties[6].color + " properties? If so, type the name of the property, if not, type 'n'");
               expression = stdin.nextLine();
               if(!expression.equals("n")){
                  howManyHouses(6, expression);
                  howManyHouses(8, expression);
                  howManyHouses(9, expression);
               }
            }
         }
      }
      
      //Pink monopoly
      if(currPlayer == properties[11].owner && currPlayer == properties[13].owner && currPlayer == properties[14].owner){
         System.out.println("You have a monopoly on " + properties[11].color + ", would you like to buy houses/hotels? Type 'y' to buy houses, or 'n' to skip");
         expression = stdin.nextLine();
         if(expression.equals("y")){
            System.out.println("Which would you like to buy houses on? Type the name of the property (" + properties[11].name + ", " + properties[13].name + ", or " + properties[14].name + ")");
            expression = stdin.nextLine();
            howManyHouses(11, expression);
            howManyHouses(13, expression);
            howManyHouses(14, expression);            System.out.println("Would you like to buy houses on any other " + properties[11].color + " properties? If so, type the name of the property, if not, type 'n'");
            expression = stdin.nextLine();
            if(!expression.equals("n")){
               howManyHouses(11, expression);
               howManyHouses(13, expression);
               howManyHouses(14, expression);                System.out.println("Would you like to buy houses on any other " + properties[11].color + " properties? If so, type the name of the property, if not, type 'n'");
               expression = stdin.nextLine();
               if(!expression.equals("n")){
                  howManyHouses(11, expression);
                  howManyHouses(13, expression);
                  howManyHouses(14, expression); 
               }
            }
         }
      }
      
      //Orange monopoly
      if(currPlayer == properties[16].owner && currPlayer == properties[18].owner && currPlayer == properties[19].owner){
         System.out.println("You have a monopoly on " + properties[16].color + ", would you like to buy houses/hotels? Type 'y' to buy houses, or 'n' to skip");
         expression = stdin.nextLine();
         if(expression.equals("y")){
            System.out.println("Which would you like to buy houses on? Type the name of the property (" + properties[16].name + ", " + properties[18].name + ", or " + properties[19].name + ")");
            expression = stdin.nextLine();
            howManyHouses(16, expression);
            howManyHouses(18, expression);
            howManyHouses(19, expression); 
            System.out.println("Would you like to buy houses on any other " + properties[16].color + " properties? If so, type the name of the property, if not, type 'n'");
            expression = stdin.nextLine();
            if(!expression.equals("n")){
               howManyHouses(16, expression);
               howManyHouses(18, expression);
               howManyHouses(19, expression);
               System.out.println("Would you like to buy houses on any other " + properties[16].color + " properties? If so, type the name of the property, if not, type 'n'");
               expression = stdin.nextLine();
               if(!expression.equals("n")){
                  howManyHouses(16, expression);
                  howManyHouses(18, expression);
                  howManyHouses(19, expression);
               }
            }
         }
      }
      
      //Red monopoly
      if(currPlayer == properties[21].owner && currPlayer == properties[23].owner && currPlayer == properties[24].owner){
         System.out.println("You have a monopoly on " + properties[21].color + ", would you like to buy houses/hotels? Type 'y' to buy houses, or 'n' to skip");
         expression = stdin.nextLine();
         if(expression.equals("y")){
            System.out.println("Which would you like to buy houses on? Type the name of the property (" + properties[21].name + ", " + properties[23].name + ", or " + properties[24].name + ")");
            expression = stdin.nextLine();
            howManyHouses(21, expression);
            howManyHouses(23, expression);
            howManyHouses(24, expression);
            System.out.println("Would you like to buy houses on any other " + properties[21].color + " properties? If so, type the name of the property, if not, type 'n'");
            expression = stdin.nextLine();
            if(!expression.equals("n")){
               howManyHouses(21, expression);
               howManyHouses(23, expression);
               howManyHouses(24, expression);
               System.out.println("Would you like to buy houses on any other " + properties[21].color + " properties? If so, type the name of the property, if not, type 'n'");
               expression = stdin.nextLine();
               if(!expression.equals("n")){
                  howManyHouses(21, expression);
                  howManyHouses(23, expression);
                  howManyHouses(24, expression);
               }
            }
         }
      }
      
      //Yellow monopoly
      if(currPlayer == properties[26].owner && currPlayer == properties[27].owner && currPlayer == properties[29].owner){
         System.out.println("You have a monopoly on " + properties[26].color + ", would you like to buy houses/hotels? Type 'y' to buy houses, or 'n' to skip");
         expression = stdin.nextLine();
         if(expression.equals("y")){
            System.out.println("Which would you like to buy houses on? Type the name of the property (" + properties[31].name + ", " + properties[32].name + ", or " + properties[34].name + ")");
            expression = stdin.nextLine();
            howManyHouses(26, expression);
            howManyHouses(27, expression);
            howManyHouses(29, expression);
            System.out.println("Would you like to buy houses on any other " + properties[26].color + " properties? If so, type the name of the property, if not, type 'n'");
            expression = stdin.nextLine();
            if(!expression.equals("n")){
               howManyHouses(26, expression);
               howManyHouses(27, expression);
               howManyHouses(29, expression);
               System.out.println("Would you like to buy houses on any other " + properties[26].color + " properties? If so, type the name of the property, if not, type 'n'");
               expression = stdin.nextLine();
               if(!expression.equals("n")){
                  howManyHouses(26, expression);
                  howManyHouses(27, expression);
                  howManyHouses(29, expression);
               }
            }
         }
      }
      
      //Green monopoly
      if(currPlayer == properties[31].owner && currPlayer == properties[32].owner && currPlayer == properties[34].owner){
         System.out.println("You have a monopoly on " + properties[31].color + ", would you like to buy houses/hotels? Type 'y' to buy houses, or 'n' to skip");
         expression = stdin.nextLine();
         if(expression.equals("y")){
            System.out.println("Which would you like to buy houses on? Type the name of the property (" + properties[31].name + ", " + properties[32].name + ", or " + properties[34].name + ")");
            expression = stdin.nextLine();
            howManyHouses(31, expression);
            howManyHouses(32, expression);
            howManyHouses(34, expression);
            System.out.println("Would you like to buy houses on any other " + properties[31].color + " properties? If so, type the name of the property, if not, type 'n'");
            expression = stdin.nextLine();
            if(!expression.equals("n")){
               howManyHouses(31, expression);
               howManyHouses(32, expression);
               howManyHouses(34, expression);
               System.out.println("Would you like to buy houses on any other " + properties[31].color + " properties? If so, type the name of the property, if not, type 'n'");
               expression = stdin.nextLine();
               if(!expression.equals("n")){
                  howManyHouses(31, expression);
                  howManyHouses(32, expression);
                  howManyHouses(34, expression);
               }
            }
         }
      }
      
      //Dark Blue monopoly
      if(currPlayer == properties[37].owner && currPlayer == properties[39].owner){
         System.out.println("You have a monopoly on " + properties[37].color + ", would you like to buy houses/hotels? Type 'y' to buy houses, or 'n' to skip");
         expression = stdin.nextLine();
         if(expression.equals("y")){
            System.out.println("Which would you like to buy houses on? Type the name of the property (" + properties[37].name + ", or " + properties[39].name + ")");
            expression = stdin.nextLine();
            howManyHouses(37, expression);
            howManyHouses(39, expression);
            System.out.println("Would you like to buy houses on any other " + properties[37].color + " properties? If so, type the name of the property, if not, type 'n'");
            expression = stdin.nextLine();
            if(!expression.equals("n")){
               howManyHouses(37, expression);
               howManyHouses(39, expression);
            }
         }
      }
      
      
      if(players[currPlayer].position < 0){
         players[currPlayer].addPos(1);
         Random rand = new Random();
         int  d1 = rand.nextInt(6) + 1;
         int  d2 = rand.nextInt(6) + 1;
         if(players[currPlayer].position == 0){
            players[currPlayer].subMoney(50);
            checkMoney();
            System.out.println("You spent 3 full turns in jail. You've been forced to pay $50, you now have $" + players[currPlayer].money + " and are just visiting");
            players[currPlayer].setPos(10);
         }
         else if(d1 == d2){
            System.out.println("You rolled doubles (" + d1 + ")! Congratulations, you are now Just Visiting! (This ends your turn)");
            players[currPlayer].setPos(10);
         }
         else{
            System.out.println("You rolled " + d1 + " and " + d2 + ", so you're still in jail. Would you like to pay the $50 now, or wait to try to roll doubles? Type 'y' to pay, or 'n' to wait");
            expression = stdin.nextLine();
            if(expression.equals("y")){
               players[currPlayer].subMoney(50);
               checkMoney();
               System.out.println("You've paid $50, you now have $" + players[currPlayer].money + " and are just visiting");
               players[currPlayer].setPos(10);
            }
            else{
               System.out.println("You didn't pay, you have " + (players[currPlayer].position * -1) + " turns to roll doubles or pay");
            }
         }
      }
      else{
         int roll = players[currPlayer].move();
         int pos = players[currPlayer].position;
         if(pos == 30){
            if(players[currPlayer].jailOut > 0){
               players[currPlayer].setPos(10);
               players[currPlayer].jailOut--;
               System.out.println("You landed on Go To Jail, but had a Get Out of Jail Free card, so you are now just visiting.");
            }
            else{
               players[currPlayer].setPos(-3);
               System.out.println("You've landed on Go To Jail, would you like to pay the $50 now, or wait to try to roll doubles? Type 'y' to pay, or 'n' to wait");
               expression = stdin.nextLine();
               if(expression.equals("y")){
                  players[currPlayer].subMoney(50);
                  checkMoney();
                  System.out.println("You've paid $50, you now have $" + players[currPlayer].money + " and are just visiting");
                  players[currPlayer].setPos(10);
               }
               else{
                  System.out.println("You didn't pay, you have 3 turns to roll doubles or pay");
               }
            }
         }
         else if(pos == 2 || pos == 17 || pos == 33){
            //community chest
            System.out.println("You landed on Community Chest!");
            Random rand = new Random();
            int  c = rand.nextInt(16) + 1;
            switch(c){
               case 1:
                  players[currPlayer].position = 0;
                  players[currPlayer].addMoney(200);
                  System.out.println("Advance to Go (Collect $200) - You now have $" + players[currPlayer].money);
                  break;
               case 2:
                  players[currPlayer].addMoney(200);
                  System.out.println("Bank error in your favor, collect $200 - You now have $" + players[currPlayer].money);
                  break;
               case 3:
                  players[currPlayer].subMoney(50);
                  System.out.println("Doctor's fee, pay $50 - You now have $" + players[currPlayer].money);
                  checkMoney();
                  break;
               case 4:
                  players[currPlayer].addMoney(50);
                  System.out.println("From sale of stock you get $50 - You now have $" + players[currPlayer].money);
                  break;
               case 5:
                  System.out.println("Get Out of Jail Free - This may be kept until needed or sold");
                  players[currPlayer].jailOut++;
                  break;
               case 6:
                  if(players[currPlayer].jailOut > 0){
                     players[currPlayer].setPos(10);
                     players[currPlayer].jailOut--;
                     System.out.println("You got a Go To Jail card, but had a Get Out of Jail Free card, so you are now just visiting.");
                  }
                  else{
                     players[currPlayer].setPos(-3);
                     System.out.println("You got a Go To Jail card, would you like to pay the $50 now, or wait to try to roll doubles? Type 'y' to pay, or 'n' to wait");
                     expression = stdin.nextLine();
                     if(expression.equals("y")){
                        players[currPlayer].subMoney(50);
                        checkMoney();
                        System.out.println("You've paid $50, you now have $" + players[currPlayer].money + " and are just visiting");
                        players[currPlayer].setPos(10);
                     }
                     else{
                        System.out.println("You didn't pay, you have 3 turns to roll doubles or pay");
                     }
                  }
                  break;
               case 7:
                  System.out.println("Grand Opera Night, collect $50 from each player");
                  int livingP = 0;
                  for(int i = 0; i < numPlayers; i++){
                     if(players[i].alive == 1 && i != currPlayer){
                        livingP++;
                        players[i].subMoney(50);
                     }
                  }
                  players[currPlayer].addMoney((livingP * 50));
                  break;
               case 8:
                  players[currPlayer].addMoney(100);
                  System.out.println("Holiday Fund matures, collect $100 - You now have $" + players[currPlayer].money);
                  break;
               case 9:
                  players[currPlayer].addMoney(20);
                  System.out.println("Income tax refund, collect $20 - You now have $" + players[currPlayer].money);
                  break;
               case 10:
                  players[currPlayer].addMoney(100);
                  System.out.println("Life insurance matures, collect $100 - You now have $" + players[currPlayer].money);
                  break;
               case 11:
                  players[currPlayer].subMoney(100);
                  System.out.println("Pay hospital fees of $100 - You now have $" + players[currPlayer].money);
                  checkMoney();
                  break;
               case 12:
                  players[currPlayer].subMoney(150);
                  System.out.println("Pay school tax of $150 - You now have $" + players[currPlayer].money);
                  checkMoney();
                  break;
               case 13:
                  players[currPlayer].addMoney(25);
                  System.out.println("Recieve $25 for services - You now have $" + players[currPlayer].money);
                  break;
               case 14:
                  for(int i = 0; i < properties.length; i++){
                     if(properties[i].owner == currPlayer){
                        if(properties[i].numHouses > 0){
                           if(properties[i].numHouses == 5){
                              players[currPlayer].subMoney(275);
                           }
                           else{
                              players[currPlayer].subMoney((40 * properties[i].numHouses));
                           }
                           checkMoney();
                        }
                     }
                  }
                  System.out.println("You are assessed for street repairs - Pay $40 per house - $115 per hotel. You now have $" + players[currPlayer].money);
                  break;
               case 15:
                  players[currPlayer].addMoney(10);
                  System.out.println("You have won second prize in a beauty contest, collect $10 - You now have $" + players[currPlayer].money);
                  break;
               case 16:
                  players[currPlayer].addMoney(100);
                  System.out.println("You inherit $100 - You now have $" + players[currPlayer].money);
                  break;
            }
         }
         else if(pos == 7 || pos == 22 || pos == 36){
            //chance
            System.out.println("You landed on Chance!");
            Random rand = new Random();
            int  c = rand.nextInt(16) + 1;
            switch(c){
               case 1:
                  players[currPlayer].position = 0;
                  players[currPlayer].addMoney(200);
                  System.out.println("Advance to Go (Collect $200) - You now have $" + players[currPlayer].money);
                  break;
               case 2:
                  System.out.println("Advance to Illinois Ave. - If you pass Go, collect $200");
                  if(players[currPlayer].position > 24){
                     players[currPlayer].addMoney(200);
                     System.out.println("You passed Go and got $200 - You now have $" + players[currPlayer].money);
                  }
                  players[currPlayer].position = 24;
                  onProperty(players[currPlayer].position, roll);
                  break;
               case 3:
                  System.out.println("Advance to St. Charles Place - If you pass Go, collect $200");
                  if(players[currPlayer].position > 11){
                     players[currPlayer].addMoney(200);
                     System.out.println("You passed Go and got $200 - You now have $" + players[currPlayer].money);
                  }
                  players[currPlayer].position = 11;
                  onProperty(players[currPlayer].position, roll);
                  break;
               case 4:
                  System.out.println("Advance token to the nearest Utility - If you pass Go, collect $200");
                  if(players[currPlayer].position > 28){
                     players[currPlayer].addMoney(200);
                     System.out.println("You passed Go and got $200 - You now have $" + players[currPlayer].money);
                     players[currPlayer].position = 12;
                     onProperty(players[currPlayer].position, roll);
                  }
                  if(players[currPlayer].position < 12){
                     players[currPlayer].position = 12;
                     onProperty(players[currPlayer].position, roll);
                  }
                  if(players[currPlayer].position > 12 && players[currPlayer].position < 28){
                     players[currPlayer].position = 28;
                     onProperty(players[currPlayer].position, roll);
                  }
                  break;
               case 5:
                  System.out.println("Advance token to the nearest Railroad - If you pass Go, collect $200");
                  if(players[currPlayer].position > 35){
                     players[currPlayer].addMoney(200);
                     System.out.println("You passed Go and got $200 - You now have $" + players[currPlayer].money);
                     players[currPlayer].position = 5;
                     onProperty(players[currPlayer].position, roll);
                  }
                  if(players[currPlayer].position < 5){
                     players[currPlayer].position = 5;
                     onProperty(players[currPlayer].position, roll);
                  }
                  if(players[currPlayer].position > 5 && players[currPlayer].position < 15){
                     players[currPlayer].position = 15;
                     onProperty(players[currPlayer].position, roll);
                  }
                  if(players[currPlayer].position > 15 && players[currPlayer].position < 25){
                     players[currPlayer].position = 25;
                     onProperty(players[currPlayer].position, roll);
                  }
                  if(players[currPlayer].position > 25 && players[currPlayer].position < 35){
                     players[currPlayer].position = 35;
                     onProperty(players[currPlayer].position, roll);
                  }
                  break;
               case 6:
                  players[currPlayer].addMoney(50);
                  System.out.println("Bank pays you a dividend of $50 - You now have $" + players[currPlayer].money);
                  break;
               case 7:
                  System.out.println("Get Out of Jail Free - This may be kept until needed or sold");
                  players[currPlayer].jailOut++;
                  break;
               case 8:
                  System.out.println("Go back 3 spaces");
                  players[currPlayer].position -= 3;
                  if(players[currPlayer].position == 4){
                     players[currPlayer].subMoney(200);
                     checkMoney();
                     System.out.println("You landed on Income Tax. You've paid $200, you now have $" + players[currPlayer].money);
                     freePark += 200;
                  }
                  if(players[currPlayer].position == 19){
                     onProperty(players[currPlayer].position, roll);
                  }
                  if(players[currPlayer].position == 33){
                     System.out.println("You landed on Community Chest, but can't draw another card this turn.");
                  }
                  break;
               case 9:
                  if(players[currPlayer].jailOut > 0){
                     players[currPlayer].setPos(10);
                     players[currPlayer].jailOut--;
                     System.out.println("You got a Go To Jail card, but had a Get Out of Jail Free card, so you are now just visiting.");
                  }
                  else{
                     players[currPlayer].setPos(-3);
                     System.out.println("You got a Go To Jail card, would you like to pay the $50 now, or wait to try to roll doubles? Type 'y' to pay, or 'n' to wait");
                     expression = stdin.nextLine();
                     if(expression.equals("y")){
                        players[currPlayer].subMoney(50);
                        checkMoney();
                        System.out.println("You've paid $50, you now have $" + players[currPlayer].money + " and are just visiting");
                        players[currPlayer].setPos(10);
                     }
                     else{
                        System.out.println("You didn't pay, you have 3 turns to roll doubles or pay");
                     }
                  }
                  break;
               case 10:
                  for(int i = 0; i < properties.length; i++){
                     if(properties[i].owner == currPlayer){
                        if(properties[i].numHouses > 0){
                           if(properties[i].numHouses == 5){
                              players[currPlayer].subMoney(200);
                           }
                           else{
                              players[currPlayer].subMoney((25 * properties[i].numHouses));
                           }
                           checkMoney();
                        }
                     }
                  }
                  System.out.println("Make general repairs on all your property - for each house pay $25 - for each hotel $100. You now have $" + players[currPlayer].money);
                  break;
               case 11:
                  players[currPlayer].subMoney(15);
                  System.out.println("Pay poor tax of $15 - You now have $" + players[currPlayer].money);
                  checkMoney();
                  break;
               case 12:
                  System.out.println("Take a ride on the Reading - If you pass Go, collect $200");
                  if(players[currPlayer].position > 5){
                     players[currPlayer].addMoney(200);
                     System.out.println("You passed Go and got $200 - You now have $" + players[currPlayer].money);
                  }
                  players[currPlayer].position = 5;
                  onProperty(players[currPlayer].position, roll);
                  break;
               case 13:
                  System.out.println("Take a walk on the Boardwalk - Advance token to Boardwalk");
                  players[currPlayer].position = 39;
                  onProperty(players[currPlayer].position, roll);
                  break;
               case 14:
                  System.out.println("You have been elected Chairman of the Board - Pay each player $50");
                  int livingP = 0;
                  for(int i = 0; i < numPlayers; i++){
                     if(players[i].alive == 1 && i != currPlayer){
                        livingP++;
                        players[i].addMoney(50);
                     }
                  }
                  players[currPlayer].subMoney((livingP * 50));
                  checkMoney();
                  break;
               case 15:
                  players[currPlayer].addMoney(150);
                  System.out.println("Your building and loan matures, collect $150 - You now have $" + players[currPlayer].money);
                  break;
               case 16:
                  players[currPlayer].addMoney(100);
                  System.out.println("You have won a crossword competition, collect $100 - You now have $" + players[currPlayer].money);
                  break;
            }
         }
         else if(pos == 0){
            System.out.println("You landed on Go");
         }
         else if(pos == 4){
            players[currPlayer].subMoney(200);
            checkMoney();
            System.out.println("You landed on Income Tax. You've paid $200, you now have $" + players[currPlayer].money);
            freePark += 200;
         }
         else if(pos == 10){
            System.out.println("You landed on jail, but don't worry, you're just visiting");
         }
         else if(pos == 20){
            players[currPlayer].addMoney(freePark);
            System.out.println("You landed on Free Parking. You've collected $" + freePark + ", you now have $" + players[currPlayer].money);
            freePark = 0;
         }
         else if(pos == 38){
            players[currPlayer].subMoney(100);
            checkMoney();
            System.out.println("You landed on Luxury Tax. You've paid $100, you now have $" + players[currPlayer].money);
            freePark += 100;
         }
         else{
            System.out.println("You landed on:");
            onProperty(pos, roll);
         }
      }
      System.out.println();
   }
   
   void onProperty(int pos, int roll){
      Scanner stdin = new Scanner(System.in);
      String expression;
      properties[pos].printLandInfo();
      if(properties[pos].owner != currPlayer && properties[pos].owner >= 0){
         int rent = properties[pos].rents[properties[pos].numHouses];
         switch(properties[pos].color){
            case "Purple":
               if(properties[pos].numHouses == 0){
                  if(properties[1].owner == properties[3].owner){
                     rent *= 2;
                  }
               }
               break;
            case "Light Blue":
               if(properties[pos].numHouses == 0){
                  if(properties[6].owner == properties[8].owner && properties[8].owner == properties[9].owner){
                     rent *= 2;
                  }
               }
               break;
            case "Pink":
               if(properties[pos].numHouses == 0){
                  if(properties[11].owner == properties[13].owner && properties[13].owner == properties[14].owner){
                     rent *= 2;
                  }
               }
               break;
            case "Orange":
               if(properties[pos].numHouses == 0){
                  if(properties[16].owner == properties[18].owner && properties[18].owner == properties[19].owner){
                     rent *= 2;
                  }
               }
               break;
            case "Red":
               if(properties[pos].numHouses == 0){
                  if(properties[21].owner == properties[23].owner && properties[23].owner == properties[24].owner){
                     rent *= 2;
                  }
               }
               break;
            case "Yellow":
               if(properties[pos].numHouses == 0){
                  if(properties[26].owner == properties[27].owner && properties[27].owner == properties[29].owner){
                     rent *= 2;
                  }
               }
               break;
            case "Green":
               if(properties[pos].numHouses == 0){
                  if(properties[31].owner == properties[32].owner && properties[32].owner == properties[34].owner){
                     rent *= 2;
                  }
               }
               break;
            case "Dark Blue":
               if(properties[pos].numHouses == 0){
                  if(properties[37].owner == properties[39].owner){
                     rent *= 2;
                  }
               }
               break;
            case "Railroad":
               int rr = 0;
               if(properties[pos].owner == properties[5].owner) rr++;
               if(properties[pos].owner == properties[15].owner) rr++;
               if(properties[pos].owner == properties[25].owner) rr++;
               if(properties[pos].owner == properties[35].owner) rr++;
               rent = 25 * rr;
               break;
            case "Utility":
               if(properties[pos].owner == properties[12].owner && properties[12].owner == properties[28].owner){
                  rent = 10 * roll;
               }
               else{
                  rent = 4 * roll;
               }
               break;
         }
         players[currPlayer].subMoney(rent);
         players[properties[pos].owner].addMoney(rent);
         System.out.println(players[properties[pos].owner].name + " owns this property, you have paid the rent of $" + rent + " to them. You now have $" + players[currPlayer].money);
         checkMoney();
      }
      else if(properties[pos].owner == currPlayer){
         System.out.println("But you own it, so you don't owe any rent!");
      }
      else{
         if(properties[pos].basePrice > players[currPlayer].money){
            System.out.println("You can't afford this property, you only have $" + players[currPlayer].money);
         }
         else{
            System.out.println("You have $" + players[currPlayer].money + ". Would you like to buy this property? Type 'y' to buy it, or 'n' to not buy it");
            expression = stdin.nextLine();
            if(expression.equals("y")){
               players[currPlayer].subMoney(properties[pos].basePrice);
               checkMoney();
               properties[pos].owner = currPlayer;
               System.out.println("Congratulations, you now own " + properties[pos].name + ". You now have $" + players[currPlayer].money);
            }
         }
      }
   }
   
   void checkMoney(){
      if(players[currPlayer].money <= 0){
         Scanner stdin = new Scanner(System.in);
         String expression;
         System.out.println(players[currPlayer].name + ", you have no money. You lose the game. Everyone else, would you like to keep playing?  Type 'y' to continue, or 'n' to end the game");
         expression = stdin.nextLine();
         if(expression.equals("y")){
            //for all properties, if currPlayer owned it, it is now unowned
            for(int i = 0; i < properties.length; i++){
               if(properties[i].owner == currPlayer) properties[i].owner = -1;
            }
            //currPlayer must be taken out of the player turn rotation
            players[currPlayer].alive = 0;
         }
         else{
            System.out.println("The game is over. Hope everyone had fun!");
            System.exit(0);
         }
      }
   }
   
   void howManyHouses(int i, String exp){
      if(exp.equals(properties[i].name)){
         Scanner stdin = new Scanner(System.in);
         String expression;
         System.out.println("You have " + properties[i].numHouses + " houses already. If you purchase more than 5 (the 5th is the hotel) you will be charged but will recieve no houses");
         System.out.println("How many houses would you like to buy? Each one is $" + properties[i].housePrice + " and you have $" + players[currPlayer].money);
         expression = stdin.nextLine();
         int h = Integer.parseInt(expression);
         players[currPlayer].subMoney((h * properties[i].housePrice));
         checkMoney();
         properties[i].numHouses += h;
         if(properties[i].numHouses > 5) properties[i].numHouses = 5;
      }
   }


   public static void main(String[] args){
      Scanner stdin = new Scanner(System.in);
      String expression;
      System.out.println("How many players are there?");
      expression = stdin.nextLine();
      int np = Integer.parseInt(expression);
      player[] players = new player[np];
      for(int i = 0; i < np; i++){
         System.out.println("What is the name of player " + (i+1) + "?");
         expression = stdin.nextLine();
         player p = new player(i, expression);
         players[i] = p;
      }
      property[] properties = new property[40];
      properties[0] = new property();
      properties[1] = new property("Mediterranean Avenue", 60, 30, 50, new int[]{2,10,30,90,160,250}, "Purple");
      properties[2] = new property();
      properties[3] = new property("Baltic Avenue", 60, 30, 50, new int[]{4,20,60,80,180,320,450}, "Purple");
      properties[4] = new property();
      properties[5] = new property("Reading Railroad", 200, 100, 0, new int[]{25}, "Railroad");
      properties[6] = new property("Oriental Avenue", 100, 50, 50, new int[]{6,30,90,270,400,550}, "Light Blue");
      properties[7] = new property();
      properties[8] = new property("Vermont Avenue", 100, 50, 50, new int[]{6,30,90,270,400,550}, "Light Blue");
      properties[9] = new property("Connecticut Avenue", 120, 60, 50, new int[]{8,40,100,300,450,600}, "Light Blue");
      properties[10] = new property();
      properties[11] = new property("St. Charles Place", 140, 70, 100, new int[]{10,50,150,450,625,750}, "Pink");
      properties[12] = new property("Electric Company", 150, 75, 0, new int[]{10}, "Utility");
      properties[13] = new property("States Avenue", 140, 70, 100, new int[]{10,50,150,450,625,750}, "Pink");
      properties[14] = new property("Virginia Avenue", 160, 80, 100, new int[]{12,60,180,500,700,900}, "Pink");
      properties[15] = new property("Pennsylvania Railroad", 200, 100, 0, new int[]{25}, "Railroad");
      properties[16] = new property("St. James Place", 180, 90, 100, new int[]{14,70,200,550,700,900}, "Orange");
      properties[17] = new property();
      properties[18] = new property("Tennessee Avenue", 180, 90, 100, new int[]{14,70,200,550,700,900}, "Orange");
      properties[19] = new property("New York Avenue", 200, 100, 100, new int[]{16,80,220,600,800,1000}, "Orange");
      properties[20] = new property();
      properties[21] = new property("Kentucky Avenue", 220, 110, 150, new int[]{18,90,250,700,875,1050}, "Red");
      properties[22] = new property();
      properties[23] = new property("Indiana Avenue", 220, 110, 150, new int[]{18,90,250,700,875,1050}, "Red");
      properties[24] = new property("Illinois Avenue", 240, 120, 150, new int[]{20,100,300,750,925,1100}, "Red");
      properties[25] = new property("B & O Railroad", 200, 100, 0, new int[]{25}, "Railroad");
      properties[26] = new property("Atlantic Avenue", 260, 130, 150, new int[]{22,110,330,800,975,1150}, "Yellow");
      properties[27] = new property("Ventnor Avenue", 260, 130, 150, new int[]{22,110,330,800,975,1150}, "Yellow");
      properties[28] = new property("Water Works", 150, 75, 0, new int[]{10}, "Utility");
      properties[29] = new property("Marvin Gardens", 280, 140, 150, new int[]{24,120,360,850,1025,1200}, "Yellow");
      properties[30] = new property();
      properties[31] = new property("Pacific Avenue", 300, 150, 200, new int[]{26,130,390,900,1100,1275}, "Green");
      properties[32] = new property("North Carolina Avenue", 300, 150, 200, new int[]{26,130,390,900,1100,1275}, "Green");
      properties[33] = new property();
      properties[34] = new property("Pennsylvania Avenue", 320, 160, 200, new int[]{28,150,450,1000,1200,1400}, "Green");
      properties[35] = new property("Short Line", 200, 100, 0, new int[]{25}, "Railroad");
      properties[36] = new property();
      properties[37] = new property("Park Place", 350, 175, 200, new int[]{35,175,500,1100,1300,1500}, "Dark Blue");
      properties[38] = new property();
      properties[39] = new property("Boardwalk", 400, 200, 200, new int[]{50,200,600,1400,1700,2000}, "Dark Blue");
      
      game G = new game(np, players, properties);
      while(1 != 0){
         G.nextTurn();
      }
   }
}