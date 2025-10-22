package pij.day06.greeterDemo;

public class GreeterDriver {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.greet();

        g = new FriendlyGreeter(); // a FriendlyGreeter can do the job of a Greeter
        g.greet();

        g = new NoTagFriendlyGreeter();
        g.greet();

        g = new GermanGreeter();
        g.greet();
        //g = new NonExtendedGermanGreeter()

        FriendlyGreeter f = new FriendlyGreeter();
        f.greet();
        // The variable f is of type FriendlyGreeter, so an object of type Greeter cannot be
        // assigned to this variable
        //f = new Greeter();
    }
}
