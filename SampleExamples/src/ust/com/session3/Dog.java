package ust.com.session3;

public class Dog implements IAnimal, IAnimalSecond{

    private String name;

    @Override
    public String sound() {
        return "Bark";
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    public Dog(String name){
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
    public void printKingdom(){
        System.out.println("Not Animal Kingdom");
    }
    
    
    @Override
    public boolean canRun() {
        return true;
    }
}
