package refresher.chapter1;

/*
 * Encapsulation: refers to bundling the data (variables) and methods 
 * (functions) that operate on the data into a single unit, 
 * called a class. 
 * 
 * It also involves restricting direct access to some of the object's
 * components, which is a means of preventing unintended interference 
 * and misuse of data.
 * 
 * Benefit(s): It helps in protecting the integrity of the data within 
 * an object, ensuring that it's accessed and modified only through 
 * well-defined interfaces (methods).
 */
public class Encapsulation {
    /*
     * To apply encapsulation, we need to use access modifiers that
     * the language provides
     * public
     * - visibility: Accessible anywhere.
     * private:
     * - visibility: Accessible only within the same class.
     * protected:
     * - visibility: Accessible within the same package/
     * Accessible in subclasses
     * (even if the subclass is in a different package).
     * default (package-private)
     * - visibility: Accessible only within the same package.
     */

    // Private member, only accessible in the class
    private int x;

    public Encapsulation(int x) {
        this.x = x;
    }

    // Access to x is only via the getter for X
    // once initalized, x cannot be changed
    public int getX() {
        return x;
    }
}
