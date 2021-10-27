public class Person {
    private static String firstName;
    private static String lastName;

    public Person(String a, String b) {
        this.firstName = a;
        this.lastName = b;
    }

    //getters n setters
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void doSomething() {
        System.out.println("im watching netflix");
    }

    @Override
    public String toString() {
        return firstName + "\n" + lastName;
    }
}
