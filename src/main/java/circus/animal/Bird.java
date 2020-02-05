package circus.animal;

//If is abstract, don't need to implement all methods
//inherited from parent class aka speak()
public abstract class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }
}
