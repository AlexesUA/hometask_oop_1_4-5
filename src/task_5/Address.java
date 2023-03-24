package task_5;

public class Address {
    int index;
    String country;
    String city;
    String street;
    int house; //змінні house та apartment доцільніше зробити строковими, щоб унакнути ситуацій з літернимидодатками до будинку
    int apartment;

    public Address(){}
    public Address(int index, String country, String city, String street, int house, int apartment){
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public void setIndex(int index) {this.index = index;}
    public int getIndex() {return index;}

    public void setCountry(String country) {this.country = country;}
    public String getCountry() {return country;}

    public void setCity(String city) {this.city = city;}
    public String getCity() {return city;}

    public void setStreet(String street) {this.street = street;}
    public String getStreet() {return street;}

    public void setHouse(int house) {this.house = house;}
    public int getHouse() {return house;}

    public void setApartment(int apartment) {this.apartment = apartment;}
    public int getApartment() {return apartment;}

    public String ToString(){
        return String.format("Індекс: %1$s, Країна: %2$s, Місто: %3$s, вул. %4$s буд. %5$s кв. %6$s",
                index, country, city, street, house, apartment);
    }
}
