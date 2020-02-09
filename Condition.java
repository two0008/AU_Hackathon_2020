public class Condition {

   int freezing = 10;
   String freezingIn = "You are freezing";
   int hunger = 5;
   String hungerIn = "You are hungry";
   int dysentary = 15;
   String dysentaryIn = "You are dying";
   String oxygenIn = "You suffocating";
   int oxygen = 75;

   public int getFreezingInt() {
   
      return freezing;
   
   }

   public String getFreezingString() {
      return freezingIn; 
   }

   public int getHungerInt() {
   
      return hunger;
   
   }

   public String getHungerString() {
      return hungerIn; 
   }

   public int getdysentaryInt() {
   
      return dysentary;
   
   }

   public String getDysentaryString() {
      return dysentaryIn; 
   }

}