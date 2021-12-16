package Java;

public class Parrot extends Bird {

    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Hey! what's up. My name is " + name + " and I'm a " + color + " parrot." );
    }

}
