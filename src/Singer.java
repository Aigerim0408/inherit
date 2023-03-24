public class Singer extends Person {
    private String bandName;

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer() {

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing(){
        System.out.println("My main occupation is singing Rock");
    }

    @Override
    public void eat() {
        System.out.println("I usually have a steak for my lunch");
    }

    @Override
    public void learn() {
        System.out.println("In this time I am learning ride horse");
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public String toString() {
        return "Singer: " + "\n" +
                "bandName: " + bandName + "\n" +
                super.toString();
    }
}
