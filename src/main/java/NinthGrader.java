public class NinthGrader extends Student { // SOME CODE NEEDED IN THIS LINE
    public NinthGrader(String a, String b) {
        super(a, b);
        setClassYear(2025);
    }

    public NinthGrader() {
        setFirstName("Sebestian");
        setLastName("Vargas");
        setClassYear(2025);
    }

    @Override
    public void doSomething() {
       System.out.println("I am doing physics");
    }

    @Override
    public String toString() {
        return this.getFirstName() + "\n" + this.getLastName() + "\n" + this.getClassYear();
    }
}
