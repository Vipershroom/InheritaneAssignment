public class Party {
    private int guests = 0;
    public int getGuests(){
        return guests;
    }
    public void setGuests(int a){
        guests = a;
    }
    public void displayInvitation(){
        System.out.println("Please come to my party");
    }
}