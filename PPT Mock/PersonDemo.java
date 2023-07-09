class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();

        // Set values using setter methods
        person.setName("John Doe");
        person.setAge(30);
        person.setAddress("123 Main St, City");

        // Get values using getter methods
        String name = person.getName();
        int age = person.getAge();
        String address = person.getAddress();

        // Display the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
