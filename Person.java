/*
public class Person {
  private String name; // private = restricted access

  public String getName() {  // Getter

    return name; 
  }

  public void setName(String newName) {     // Setter

    this.name = newName;
  } 


  public static void main(String[] args) {

    Person myObj = new Person();

    myObj.setName("Pippo"); // Settiamo il valore name = "pippo"

    System.out.println(myObj.getName());
  
  }
    
}
class Vehicle {

  protected String brand = "Ford";       

  public void honk() {                    

    System.out.println("Tuut, tuut!"); }}

class Car extends Vehicle {

  private String modelName = "Mondeo";    

  public static void main(String[] args) {

    Car myCar = new Car();

    myCar.honk();

    System.out.println(myCar.brand + " " + myCar.modelName);}

}
class Veicolo {
  // //Creazione di una classe genitore. definire un metodo
  void run() {
    System.out.println("Il veicolo è in marcia");
  }
}

class Bike extends Veicolo {
  public static void main(String args[]) {
    Bike obj = new Bike();
    obj.run();
  }
}

class Bike2 extends  Veicolo{

  void run() {
    System.out.println("La bici sta correndo in sicurezza");
  } // metodo della classe genitore

  public static void main(String args[]) {
    Bike2 obj = new Bike2(); // crea oggetto
    obj.run();
  }
}
class Bank{  
  int getRateOfInterest(){return 0;}  } 
class SBI extends Bank{  
  int getRateOfInterest(){return 8;}  }  
class ICICI extends Bank{  
  int getRateOfInterest(){return 7;}  }  
class AXIS extends Bank{  
  int getRateOfInterest(){return 9;}  }  


class Test2{  
  public static void main(String args[]){  
     SBI s=new SBI();  
     ICICI i=new ICICI();  
     AXIS a=new AXIS();  
     System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
     System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
     System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
  }  
} 
class Parent {
  void show()
  {
    System.out.println("Parent's show()");
    System.out.println("WOWOWOOWOWOWOWOWOWO"); 
 }

}
class Child extends Parent {
  @Override
  void show() {   
      super.show();
      System.out.println("Child's show()");  }
}
class Main {
  public static void main(String[] args){
      Parent obj = new Child();
      obj.show();}
}
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  } }
class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  } }
class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  } }
class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  
    Animal myPig = new Pig(); 
    Animal myDog = new Dog();  
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
 }  }


abstract class Animal {
  public abstract void animalSound();
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    // Animal myAnimal = new Animal(); non si possono istanziare classi astratte
    Animal myPig = new Pig();
    Animal myDog = new Dog();
    // myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}*/
interface Animal {
  public void animalSound(); // interface method (does not have a body)

  public void sleep(); // interface method (does not have a body)}

  class Pig implements Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }

    public void sleep() {
      System.out.println("Zzz");
    }
  }

  class Main {
    public static void main(String[] args) {
      Pig myPig = new Pig();
      myPig.animalSound();
      myPig.sleep();
    }
  }
}