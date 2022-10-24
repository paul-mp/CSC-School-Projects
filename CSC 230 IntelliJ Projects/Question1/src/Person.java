public class Person {
    private String name;
    private String address;

    public Person() {

    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String name = " ";
        name = getName() + ": " + getAddress();

        return name;
    }
}
