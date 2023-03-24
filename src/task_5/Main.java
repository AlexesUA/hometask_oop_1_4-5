package task_5;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address();
        address1.index = 11001;
        address1.country = "Ukraine";
        address1.city = "Kyiv";
        address1.street = "Shevchenka";
        address1.house = 12;
        address1.apartment = 25;


        System.out.println("Адреса 1: " + address1.ToString());

        Address address2 = new Address(54001, "Ukraine", "Mykolaiv", "Kvitneva", 95, 104);

        System.out.println("Адреса 2: " + address2.ToString());
    }
}