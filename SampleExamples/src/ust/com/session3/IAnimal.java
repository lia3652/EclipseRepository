package ust.com.session3;

public interface IAnimal {


    public String sound();

    public boolean canFly();

    public boolean canSwim();
    public String getName();

    public void setName(String name);

    default void printKingdom(){
        System.out.println("Animal Kingdom");}
        
    default void AddKingdom(){
            System.out.println("Kingdom added");
        }

    
}
