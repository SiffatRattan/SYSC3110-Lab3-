public class BuddyInfo {

    //attributes
    private String name;
    private String address;
    private String phone_number;

    //Default Constructor
    public BuddyInfo(String name, String address, String phone_number){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    //Overload Constructor
    public BuddyInfo(){
        this("N.A.", "N.A.", "N.A.");
    }

    //getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    //public main (){
        //System.out.println("Hello world!");

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "14 NewYork City", "345-456-9876");

        System.out.println("Hello " + buddy.getName());
    }
}

/*
public class BuddyInfo{
    static void main (){
        //System.out.println("Hello world!");
    }
 */


