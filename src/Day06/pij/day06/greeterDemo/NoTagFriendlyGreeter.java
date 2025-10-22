package pij.day06.greeterDemo;

public class NoTagFriendlyGreeter extends Greeter {
    // without the @Override tag this spelling mistake will not be picked up
    // by IDE or compiler
    public void greeet() {
        System.out.println("Goodbye");
    }
}
