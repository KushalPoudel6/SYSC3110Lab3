import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> info;

    public AddressBook(){
        info = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo b){
        info.add(b);
    }

    public void removeBuddy(BuddyInfo b){
        info.remove(b);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
