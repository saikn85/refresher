package refresher;

import refresher.chapter1.Abstraction;
import refresher.chapter1.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Abstraction starts here, go deep!
        Abstraction.DoStackOperations();

        // Encapsulation
        Encapsulation ob = new Encapsulation(0);
        // consumer of Encapsulation can only access members that have
        // been marked with public access modifier
        ob.getX();
    }
}