public class Main {
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}