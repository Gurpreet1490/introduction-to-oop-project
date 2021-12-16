package Java;

public abstract class Bird
{
    protected String name;
    protected String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void speak();

    public void fly() {
        System.out.println("I'm " + name + " and I can fly high in the blue sky!");
    }

}

