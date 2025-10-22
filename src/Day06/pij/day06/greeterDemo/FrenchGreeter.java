package pij.day06.greeterDemo;

public class FrenchGreeter extends Greeter {
    @Override
    public void greet() {
        // does not use greet() from Greeter
        System.out.println("Salut");
    }
}
