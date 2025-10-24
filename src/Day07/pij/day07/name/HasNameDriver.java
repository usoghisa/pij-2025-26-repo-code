package pij.day07.name;

public class HasNameDriver {
    public static void main(String[] args) {
        HasName hasName1 = new City("London", 8900000);
        HasName hasName2 = new Person("George", "Birkbeck");

        System.out.println(hasName1.getName());
        System.out.println(hasName2.getName());

        //System.out.println(hasName1.getPopulation()); // does not work!
    }
}
