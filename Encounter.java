
public class Encounter {
	
	public String getName(int num) {
		String[] nameArray = {"Meteor Shower","Sandstorm","Canyon Crossing", "Punctured Wheel", "Space Pirates"};
		
		String result = nameArray[num];
		return result;
	}
	
	public String getDesc(int num) {
		
		//Strings that correlate to each encounter
		String a = "An asteroid as broken up in the Martian atmosphere and a storm of meteriods "
				+ "is falling on the party's position. You have two options.";
		
		String b = "A storm on the Martian surface has kicked up a considerable amount of dust."
				+ " Sand blocks your vision and slows down the party's progress. You have two options.";
		
		String c = "A deep canyon on the Martian surface blocks the party's path. You have two options.";
		
		String d = "A rock in on the trail has stuck your tire, and punctured a hole in it."
				+ " You have two options.";
		
		String e = "A party of nomadic space pirates has ambushed the party and are asking for traveling taxes."
				+ " You have two options.";
		//Creates array with strings for each encounter
		String[] descArray = {a,b,c,d,e};
		
		String result = descArray[num];
		return result;
	}
	
	public String getOpt1(int num) {
		
		String a = "Stop moving and take shelter";
		String b = "Stop moving and take shelter from the storm";
		String c = "Try to go around the canyon";
		String d = "Try to replace the tire completly";
		String e = "Refuse to give up supplies to the cutthroats";
		
		String[] opt1Array = {a,b,c,d,e};

		
		String result = opt1Array[num];
		return result;
	}
	
	public String getOpt1Result(int num) {
		
		String a = "The party only moves 50 miles today, and loses 10 food.";
		String b = "The party moves 0 miles, and loses 15 food.";
		String c = "The party moves only 50 miles, and loses 15 food.";
		String d = "The party is able to continue on their journy and moves 100 miles, but use 15 spare parts.";
		String e = "The party moves 0 miles and must lose 1 oxygen container";
		
		String[] opt1Array = {a,b,c,d,e};

		
		String result = opt1Array[num];
		return result;		
		
	}
	
	
	
	
    public String getOpt2(int num) {
		
		String a = "Continue moving and brute force it";
		String b = "Push through the storm hoping it passes quickly";
		String c = "Attempt to traverse the canyon";
		String d = "Attempt to repair the hole";
		String e = "Give into their demands and pay the tax";

		String[] opt2Array = {a,b,c,d,e};
		
		String result = opt2Array[num];
		return result;
		
    }
    
public String getOpt2Result(int num) {
		
		String a = "The party is able to move 150 miles, but an oxygen canister gets crushed.";
		String b = "The party is able to move 100 miles today, but the party loses 10 spare parts to the storm.";
		String c = "The party finds a way thought the canyon and moves 150 miles, but they use 10 medicine because a few members got injured.";
		String d = "The party quickly repairs the hole and moves 200 miles, and only uese 5 spare parts fixing the leak.";
		String e = "The party is able to move 200 miles today, but pays the pirates 15 food and 15 spare parts.";

		String[] opt2Array = {a,b,c,d,e};
		
		String result = opt2Array[num];
		return result;
	}
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	

}
