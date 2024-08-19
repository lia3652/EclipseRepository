package ust.com.session3;

public class Cat implements IAnimal, IAnimalSecond{

    private String name;
    @Override
    public String sound() {
        return "Meow";
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    public Cat(String name){
        this.name = name;
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
        IAnimal.super.printKingdom();
    }

    @Override
    public boolean canRun() {
        return true;
    }
}

