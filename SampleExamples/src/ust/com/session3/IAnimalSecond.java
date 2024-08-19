package ust.com.session3;

public interface IAnimalSecond {

    public boolean canRun();

    default void printKingdom(){
        System.out.println("Animal Second Kingdom");
    }
}
