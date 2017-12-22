

public class property {

   String name;
   int basePrice;
   int mortgagePrice;
   int housePrice;
   int[] rents;
   String color;
   int numHouses = 0;
   int owner = -1;

   property(){
   }
   
   property(String name, int basePrice, int mortgagePrice, int housePrice, int[] rents, String color){
      this.name = name;
      this.rents = rents;
      this.color = color;
      this.basePrice = basePrice;
      this.mortgagePrice = mortgagePrice;
      this.housePrice = housePrice;
   }
   
   void addHouse(){
      this.numHouses++;
   }
   
   void changeOwner(int owner){
      this.owner = owner;
   }
   
   void printLandInfo(){
      System.out.println("Name: " + this.name);
      System.out.println("Color: " + this.color);
      if(this.owner == -1){
         System.out.println("Price: $" + this.basePrice);
         System.out.println("Base Rent: $" + this.rents[0]);
      }
      else{
         System.out.println("This property is owned, you have to pay the owner");
      }
   }



   public static void main(String[] args){
      int[] bRent = {50,200,600,1400,1700,2000};
      property boardwalk = new property("Boardwalk", 400, 200, 75, bRent, "Dark Blue");
      boardwalk.printLandInfo();
      boardwalk.changeOwner(2);
      boardwalk.addHouse();
      boardwalk.printLandInfo();

   }
}