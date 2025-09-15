public class BuddyInfo {

    private String name;
    private String address;
    public BuddyInfo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo b = new BuddyInfo("Homer", "carleton");
        System.out.println("Hello " + b.getName());
    }
}
