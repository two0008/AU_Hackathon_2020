import java.util.Scanner;
public class encounters implements events {
    public static int[] main() {
        // Whatever the encounter says when it is called.
        System.out.println(name + "\n" + description)
        System.out.println("\n [1]: " + option1 + "\n [2]: " + option2 + "\n>> ");
        
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == 1) return option1Modifiers;
        return option2Modifiers;
    }
    public void setName(String nameIn) {
        nameIn = name;
    }
    public void setDescription(String descIn) {
        descIn = description;
    }
    public void setOption1Modifiers(int[] modIn) {
        modIn = option1Modifiers;
    }
    public void setOption2Modifiers(int[] modIn) {
        modIn = option2Modifiers;
    }
    public void setOption1(String optIn) {
        optIn = option1;
    }
    public void setOption2(String optIn) {
        optIn = option2;
    }
}