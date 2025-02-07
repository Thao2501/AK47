package ZPractice;

public class Person {
    String due, firstName, lastName;

    public Person(String due, String firstName, String lastName) {
        this.due = due;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Double Due() {
        return Double.parseDouble(this.due.replace("$", ""));
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
