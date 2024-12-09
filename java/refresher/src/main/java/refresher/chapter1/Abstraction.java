package refresher.chapter1;

import java.util.Stack;

/*
* Abstraction: Abstraction involves the process of hiding the complex implement-
* ation details and showing only the essential features of the object. 
* It allows you to focus on what an object does rather than how it does it.
*
* Benefits: It simplifies the complex reality by modeling classes appropriate 
* to the problem, helping in reducing complexity and enhancing maintainability.
*/
public class Abstraction {
    /*
    * The simplest example can be all the internal APIs that a language 
    * offer
    *
    * Let's look at the Stack<T> Generic class
    */
    public static void DoStackOperations()
    {
        // The below just gives us an instance/object of the
        // Stack<Integer>, we are not sure as to how the object
        // creation happens, which is nothing but abstraction.
        // Huh!!! The explantion can be better
        Stack<Integer> simpleStack = new Stack<>();
        
        // Let's look at the push method that Stack offers
        // We as consumers of the Stack class aren't aware of the 
        // exact implementation details, they are abstracted away, and
        // only shows essential features of the Stack<Integer> class
        simpleStack.push(10);

        // Building on, at this stage, ask yourself
        // 1. Are you aware of the internal data structure that stack uses?
        // 2. How does Stack<Integer> class scale; that is, how it is able to 
        // accommodate countably finite elements (as permitted by the langauge)?
        System.out.println(simpleStack.peek());

        // Now, if you're stumped, then don't be, this is what Abstraction is!
        // A foundational concept that allows you to focus on what an object 
        // does rather than how it does it.
    }
}
