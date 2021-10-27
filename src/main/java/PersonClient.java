public class PersonClient {
    public static void main(String[] args) {
        // Write some very very basic testing code here
        // Create a Person and then call each of the
        // methods on the Person
        Person sebseb = new Person("sebastian", "vargas");
        sebseb.setFirstName("sebseb");
        sebseb.setLastName("ekren");
        System.out.println(sebseb.getFirstName() + "\n" + sebseb.getLastName());
        sebseb.doSomething();
    }
}