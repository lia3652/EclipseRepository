package ust.com.session3;

public class Bird implements  IAnimal, IAnimalSecond{
    private String name;

    public Bird(String name){
        this.name = name;
    }

    @Override
    public String sound() {
        return "Chirp";
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void printKingdom() {
        IAnimalSecond.super.printKingdom();
    }

    public void birdMethod(){
        System.out.println("Bird MEthod");
    }


    @Override
    public boolean canRun() {
        return false;
    }
}
