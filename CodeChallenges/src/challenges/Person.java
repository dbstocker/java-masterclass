package challenges;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return (this.getAge() > 12 && this.getAge() < 20);
    }

    public String getFullName() {
        if (this.getFirstName().isEmpty() && this.getLastName().isEmpty()) {
            return "";
        } else if (this.getFirstName().isEmpty()) {
            return this.getLastName();
        } else if (this.getLastName().isEmpty()) {
            return this.getFirstName();
        } else {
            return this.getFirstName() + " " + this.getLastName();
        }
    }
}
