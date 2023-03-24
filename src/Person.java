public class Person {
    private String name;
    private String designation;


    public Person() {

    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void eat() {
        System.out.println("eating");
    }

    public void learn() {
        System.out.println("Leaning");
    }

    public void walk() {
        System.out.println("I usually walk in the park every morning");
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" +
                "designation: " + designation;
    }
}
