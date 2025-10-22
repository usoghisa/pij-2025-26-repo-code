package pij.day06.greeterDemo;

public class FriendlyGreeter extends Greeter {
    @Override
    public void greet() {
        super.greet(); // uses greet() from Greeter
        System.out.println("Nice to meet you");
    }
}
