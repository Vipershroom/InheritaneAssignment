import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class UseParty {
    public static void main(String[] args){

        // Guests Portion
        int guests = 0;
        HashMap<Integer, String> menuItems = generate_menu();
        Party a = new Party();
        Scanner s = new Scanner(System.in);
        System.out.println("How many guests are coming?");
        guests = inputNumber();
        System.out.println("the party has "+guests+" guests");
        a.setGuests(guests);
        a.displayInvitation();

        // Dinner Portion
        DinnerParty dinner = new DinnerParty();
        System.out.println("How many guests are coming for the dinner party?");
        guests = inputNumber();
        dinner.setGuests(guests);

        // Renders the menu by iterating through a hashmap
        System.out.println("Enter the Menu Option");
        for (Map.Entry<Integer, String> i : menuItems.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }

        int choice = inputNumber();
        dinner.setDinnerChoice(choice); 
        System.out.println("the dinner party has "+guests+" guests");
        System.out.println("Menu option " + choice + " will be served");
        dinner.displayInvitation();
    }

    public static int inputNumber(){
        // checks if next line inputted is an int, if not loops through the choice again.
        System.out.println("Please input a number");
        Scanner d = new Scanner(System.in);
        int c = 0;
        if (d.hasNextInt()){
            c = d.nextInt();
        }else {
            c = inputNumber();
        }
        return (c);
    }

    public static HashMap<Integer, String> generate_menu() {
        // Method that generates the hashmap. 
        // The code was made into a method to make the code much cleaner
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        hash.put(1, "Chicken");
        hash.put(2, "Vegi");
        return hash;
    }
}
