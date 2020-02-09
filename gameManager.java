/*
 * gameManager.java
 * @author two0008
 * 
 * Description: To run and control the game. Control main stats and win conditions.
 * 
 * Stats:
 * Miles - the distance travelled on the journey.
 * 
 * Win Condition:
 * The characters have reached 10,000 miles
 * 
 * Lose Condition:
 * No more characters are alive.
 */

import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

 public class gameManager {
     public static String main() {
         // Variables
        
         /*
         int miles = 0;
         

         int oxygen = 100;
         int medicine = 100;
         int spareParts = 100;
         int food = 100;
         */

         //             [oxygen  medicine    S.P.    food   miles]   
         int[] stats =  {100,    100,        100,    100,   0};
         int NUM_ENCOUNTERS = 5;

         Scanner input = new Scanner(System.in);
         System.out.println("What would would like the first character's name to be?\n>> ");
         String name1 = input.nextLine();
         character c1 = new character(name1);
         System.out.println("What would would like the second character's name to be?\n>> ");
         String name2 = input.nextLine();
         character c2 = new character(name2);
         System.out.println("What would would like the third character's name to be?\n>> ");
         String name3 = input.nextLine();
         character c3 = new character(name3);
         System.out.println("What would would like the fourth character's name to be?\n>> ");
         String name4 = input.nextLine();
         character c4 = new character(name4);

         List<character> party = new ArrayList<>(Arrays.asList(c1, c2, c3, c4));

         // INITIALIZATION OF encounters.
         encounters e0 = new encounters();
         e0.setName("Meteor Shower");
         e0.setDescription("An asteroid as broken up in the Martian atmosphere and a storm of meteriods "
         + "is falling on the party's position. You have two options.");
         e0.setOption1("Stop moving and take shelter");
         int[] e01mod = {0,0,0,-10,50};
         e0.setOption1Modifiers(e01mod);
         e0.setOption2("Continue moving and brute force it");
         int[] e02mod = {-50,0,0,0,150};
         e0.setOption2Modifiers(e02mod);
         
         encounters e1 = new encounters();
         e1.setName("Sandstorm");
         e1.setDescription("A storm on the Martian surface has kicked up a considerable amount of dust."
         + " Sand blocks your vision and slows down the party's progress. You have two options.");
         e1.setOption1("Stop moving and take shelter from the storm");
         int[] e11mod = {0,0,0,-15,0};
         e1.setOption1Modifiers(e11mod);
         e1.setOption2("Push through the storm hoping it passes quickly");
         int[] e12mod = {0,-10,0,0,100};
         e1.setOption2Modifiers(e12mod);

         encounters e2 = new encounters();
         e2.setName("Canyon Crossing");
         e2.setDescription("A deep canyon on the Martian surface blocks the party's path. You have two options.");
         e2.setOption1("Try to go around the canyon"); 
         int[] e21mod = {0,0,0,-15,50};
         e2.setOption1Modifiers(e21mod);
         e2.setOption2("Attempt to traverse the canyon");
         int[] e22mod = {0,-10,0,0,150};
         e2.setOption2Modifiers(e22mod);

         encounters e3 = new encounters();
         e3.setName("Punctured Wheel");
         e3.setDescription("A rock in on the trail has stuck your tire, and punctured a hole in it."
         + " You have two options.");
         e3.setOption1("Try to replace the tire completly"); 
         int[] e31mod = {0,0,-15,0,100};
         e3.setOption2("Attempt to repair the hole");
         int[] e32mod = {0,0,-5,0,200};
         e3.setOption2Modifiers(e32mod);

         encounters e4 = new encounters();
         e4.setName("Space Pirates");
         e4.setDescription("A party of nomadic space pirates has ambushed the party and are asking for traveling taxes."
         + " You have two options.");
         e4.setOption1("Refuse to give up supplies to the cutthroats");
         int[] e41mod = {-50, 0, 0, 0, 0};
         e4.setOption1Modifiers(e41mod);
         e4.setOption2("Give into their demands and pay the tax");
         int[] e42mod = {0,0,-15,-15,200};
         e4.setOption2Modifiers(e42mod);

         // INITIALIZATION of Conditions
         conditions c0 = new conditions();
         conditions c1 = new conditions();
         conditions c2 = new conditions();
         conditions c3 = new conditions();


         List<encounters> encounterList = new ArrayList<>(Arrays.asList(a0, a1, a2, a3, a4));
         
         // CONDITIONS
         boolean WIN_CONDITION = miles >= 10000;
         boolean LOSE_CONDITION = party.size() <= 0;
         // Loop
         while (!WIN_CONDITION || !LOSE_CONDITION) {
            // Keeping track of characters alive.
            for (character c : party) {
                if (c.health <= 0) party.remove(c);
            }
         
            // Play the encounter.
            Random randObj = new Random();
            int encounterIDX = randObj.nextInt(NUM_ENCOUNTERS-1);
            int[] encounterAnswer = encounterList.get(encounterIDX).main();
            int[] roundStats = new int[5];
            for (int i = 0; i < stats.length; i++) {
                roundStats[i] = stats[i] + encounterAnswer[i];
            }
            stats = roundStats;

            // Reprecusions
            for (int ii = 0; ii < encounterList.size(); ii++) {
                if (stats[ii] <=0) {
                    for (Character npc : party) {
                        npc.health -= encounterList[ii].healthModifier;
                        if (npc.health <= 0) party.remove(ii);
                    }
                }
            }

         }
         if (WIN_CONDITION) return "Congrats you Won!";
         return "You Lost!";
     }
 }