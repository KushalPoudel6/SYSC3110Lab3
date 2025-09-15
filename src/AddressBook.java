import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> info;

    public AddressBook(){
        info = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo b){
        info.add(b);
    }

    public boolean removeBuddy(BuddyInfo b){
        return info.remove(b);
    }
    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
