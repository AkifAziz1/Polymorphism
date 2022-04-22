class Animal {

    private String name;

    public Animal(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Heyvan danishir.:)");
    }
}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " Oxuyur");

    }
}

class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " Kishneyir");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " Hürür");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Heyvan");
        Bird bird = new Bird("Limon");
        Horse horse = new Horse("Vefali");
        Dog dog = new Dog("Alabash");

        /*animal.speak();
        bird.speak();
        horse.speak();          // Ashagidaki setre gore commente aldim
        dog.speak();*/


        // Bu polymorphism numunesidir, burda animal horse kimi davrandi amma kodun ozunde bir deyisiklik etmedik..

        Animal animal1 = new Horse("Vefali"); //Burda "Horse"-un yerine Dog yaxud Bird de ola bilerdi
        animal1.speak();

    }
}

