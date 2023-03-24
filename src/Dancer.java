public class Dancer extends Person {
    private String groupName;

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer() {

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println("I every day training dancing with my group");
    }

    @Override
    public void eat() {
        System.out.println("I only eat vegetarian food");
    }

    @Override
    public void learn() {
        System.out.println("Leaning driving car");
    }

    @Override
    public String toString() {
        return "Dancer: " + "\n" +
                " Group Name: " + groupName + "\n" +
                super.toString();
    }
}

