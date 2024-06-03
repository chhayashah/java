public class Inheritance {
    public static void main(String[] args) {
        // Fish sh a rk=new Fish();
        // shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {

    String breed;
}

// class Fish extends Animal{
// int fins;

// void swin(){
// System.out.println("swins in water");
//
//