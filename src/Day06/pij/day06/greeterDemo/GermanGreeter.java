package pij.day06.greeterDemo;

public class GermanGreeter extends Greeter {
    @Override
    public void greet() {
        // does not use greet() from Greeter
        System.out.println("Hallo");
    }
}
