package exo14.zoo;

public class Dog extends Animal{
    public Dog(){
        super();
        System.out.println("Chien instancié");
    }
    public void bark() {
        System.out.println("This dog is barking");
    }
}
