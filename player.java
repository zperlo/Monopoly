import java.util.Random;

public class player {
   String name;
   int money = 1500;
   int number;
   int position = 0;
   int alive = 1;
   int jailOut = 0;
   
   player(int number, String name){
      this.number = number;
      this.name = name;
   }
   
   void addMoney(int num){
      this.money += num;
   }
   
   void subMoney(int num){
      this.money -= num;
   }
   
   int move(){
      Random rand = new Random();
      int  d1 = rand.nextInt(6) + 1;
      int  d2 = rand.nextInt(6) + 1;
      this.position += (d1 + d2);
      System.out.println("You rolled a " + (d1+d2));
      if(this.position >= 40){
         this.position -= 40;
         this.money += 200;
         System.out.println("You passed go and have collected $200! You now have $" + this.money);
      }
      return (d1 + d2);
   }
   
   void setPos(int newPos){
      this.position = newPos;
   }
   
   void addPos(int num){
      this.position += num;
   }


public static void main(String[] args){
   

}
}