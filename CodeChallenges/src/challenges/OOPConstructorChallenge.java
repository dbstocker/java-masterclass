package challenges;

public class OOPConstructorChallenge {
    public OOPConstructorChallenge() {
        this.creditLimit = 1000d;
    }

    public OOPConstructorChallenge(String name, String email) {
        this(name, 1000d, email);
    }

    public OOPConstructorChallenge(String name, Double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    
    String name;
    double creditLimit;
    String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void printDetails() {
        System.out.println("\n");
        System.out.println(this.getName());
        System.out.println(this.getCreditLimit());
        System.out.println(this.getEmail());
    }
}
