import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class UseParty {
    public static void main(String[] args){
        int guests = 0;
        Party a = new Party();
        HashMap<Integer, String> menuItems = generate_menu();
        Scanner s = new Scanner(System.in);
        System.out.println("How many guests are coming?");
        guests = s.nextInt();
        System.out.println("the party has "+guests+" guests");
        a.setGuests(guests);
        a.displayInvitation();
        DinnerParty dinner = new DinnerParty();

        for (Map.Entry<Integer, String> i : menuItems.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }

    public static HashMap<Integer, String> generate_menu() {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        hash.put(1, "Chicken");
        hash.put(2, "Vegi");
        hash.put(3, "Pasta");
        hash.put(4, "Pad Thai");
        return hash;
    }
}
