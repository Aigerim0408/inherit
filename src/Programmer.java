public class Programmer extends Person {
    private String companyName;

    public Programmer() {
    }

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println("I am codding every morning");
    }

    @Override
    public void eat() {
        System.out.println("I usually eat fast food, because I don't have time");
    }

    @Override
    public void learn() {
        System.out.println("Leaning English language");
    }

    @Override
    public String toString() {
        return "Programmer: " +"\n"+
                " Company Name: " + companyName + "\n" +
                super.toString();
    }
}
