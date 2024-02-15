import java.util.Scanner;

public class UseParty {
    public static void main(String[] args){
        int guests = 0;
        Party a = new Party();
        Scanner s = new Scanner(System.in);
        System.out.println("How many guests are coming?");
        guests = s.nextInt();
        System.out.println("the party has "+guests+" guests");
        a.setGuests(guests);
        a.displayInvitation();
    }
}
