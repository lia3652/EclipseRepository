package ust.com.abs;
abstract class Animal {
	  String name;
	  abstract void makeSound();

	  public void eat() {
	    System.out.println("I can eat.");
	  }
	}

	class Dog extends Animal {

	  public Dog(String string) {
			this.name=string;
		}

	// provide implementation of abstract method
	  public void makeSound() {
	    System.out.println("Bark bark");
	  }
	  
	  public void eat() {
		    System.out.println("I can eat chicken.");
		  }
	}

	class Main {
	  public static void main(String[] args) {

	    // create an object of Dog class
	    Dog d1 = new Dog("puppy");

	    d1.makeSound();
	    d1.eat();
	    
	    Animal anim=new Dog("puppy");
	    System.out.println("name is:"+ anim.name);
	    anim.makeSound();
	    anim.eat();
	    
	  }
	}