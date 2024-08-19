package ust.com.session3;

public class InterfaceDemoApplication {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat1");
        Dog dog = new Dog("Dog1");
        Bird bird = new Bird("Bird1");


        System.out.println("accessing cat functions using cat object");
        System.out.println(cat.getName());
        System.out.println(cat.canFly());
        System.out.println("accessing dog functions using dog object");
        System.out.println(dog.getName());
        System.out.println(dog.canFly());
        System.out.println("accessing bird functions using bird object");
        System.out.println(bird.getName());
        System.out.println(bird.canFly());
        
        System.out.println("accessing bird functions using animal reference");
        IAnimal animal = new Bird("Bird2");
        System.out.println(animal.getName());
        System.out.println(animal.canFly());
        animal.printKingdom();//check for fn in bird and called ianimalsecond.printkingdom
        animal.AddKingdom();//check for fn in dog since not there called Ianimal.addkingdom

        System.out.println("accessing dog functions using animal reference");
        IAnimal animal1 = new Dog("Dog2");
        System.out.println(animal1.getName());
        System.out.println(animal1.sound());
        animal1.printKingdom();




        System.out.println("Using Default Methods");
        System.out.println("Cat's Kingdom:");
        cat.printKingdom();
        System.out.println("Dog's Kingdom:");
        dog.printKingdom();
        System.out.println("Bird's Kingdom:");
        bird.printKingdom();

        System.out.println("Dog2 Object Kingdom");
        animal1.printKingdom();


        System.out.println("Demo Multiple Inheritnce:");
        System.out.println(bird.canRun());
        System.out.println(cat.canRun());
        System.out.println(dog.canRun());




        //base class


    }
}
