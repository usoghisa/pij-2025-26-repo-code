package pij.day06.greeterDemo;

// does not extend Greeter, but otherwise looks like FrenchGreeter:
// cannot be used where Greeter is expected
public class NonExtendedFrenchGreeter {
    public void greet() {
        System.out.println("Salut");
    }
}
