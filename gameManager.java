/*
 * gameManager.java
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
         System.out.println("What would would like the first character's name to be?\n>> ")
         String name1 = input.nextLine();
         character c1 = new character(String name1);
         System.out.println("What would would like the second character's name to be?\n>> ")
         String name2 = input.nextLine();
         character c2 = new character(String name2);
         System.out.println("What would would like the third character's name to be?\n>> ")
         String name3 = input.nextLine();
         character c3 = new character(String name3);
         System.out.println("What would would like the fourth character's name to be?\n>> ")
         String name4 = input.nextLine();
         character c4 = new character(String name4);

         List<character> party = new ArrayList<>(Arrays.asList(c1, c2, c3, c4));
         int charactersAlive = party.size();

         // INITIALIZATION OF encounters.
         encounters a0 = new encounters();
         encounters a1 = new encounters();
         encounters a2 = new encounters();
         encounters a3 = new encounters();
         encounters a4 = new encounters();

         List<encounters> encounterList = new ArrayList<>(Arrays.asList(a0, a1, a2, a3, a4)) 
         
         // CONDITIONS
         boolean WIN_CONDITION = miles >= 10000;
         boolean LOSE_CONDITION = charactersAlive <= 0;
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
                roundStats[i] = stats[i] - encounterAnswer[i];
            }
            stats = roundStats;

            // Reprecusions
            for (int ii = 0; ii < encounterList.size(); ii++) {
                if (stats[ii] <=0) conditionsList[ii]. // do conditions code...
            }

         }
         if (WIN_CONDITION) return "Congrats you Won!";
         return "You Lost!";
     }
 }