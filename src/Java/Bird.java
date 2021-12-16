package Java;

public class Bird {

    protected String name;
    protected String color;

    public Bird(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void speak() {
        System.out.println("My name is " + name + " and I am " + color + " bird.");
    }

    public void fly() {
        System.out.println("I'm " + name + " and I can fly high in the blue sky!");
    }

    public static void main(String[] args) {
        Bird myBird = new Bird("Tweety", "Yellow");
        myBird.speak();
        myBird.fly();
    }
}

