package pij.day06.greeterDemo;

// does not extend Greeter, but otherwise looks like GermanGreeter:
// cannot be used where Greeter is expected
public class NonExtendedGermanGreeter {
    public void greet() {
        System.out.println("Hallo");
    }
}
