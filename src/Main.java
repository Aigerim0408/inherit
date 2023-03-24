public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setName("My name is Aidar");
        programmer.setDesignation("Programmer");
        programmer.setCompanyName("Oracle company");
        System.out.println(programmer);
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();
        System.out.println();

        Dancer dancer = new Dancer();
        dancer.setName("Safiya");
        dancer.setDesignation("Ballet dancer");
        dancer.setGroupName("Butterfly");
        System.out.println(dancer);
        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dancing();
        System.out.println();

        Singer singer = new Singer();
        singer.setName(" My name is Freddie Mercury");
        singer.setDesignation("Soloist of group");
        singer.setBandName("Queen");
        System.out.println(singer);
        singer.eat();
        singer.learn();
        singer.singing();
        singer.walk();



    }
}