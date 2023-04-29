package com.dependency.inversion.examples.windows.solution;

/***
 * Now our classes are decoupled and communicate through the Keyboard abstraction. If we want,
 * we can easily switch out the type of keyboard in our machine with a different implementation
 * of the interface. We can follow the same principle for the Monitor class.
 *
 * Excellent! We've decoupled the dependencies and are free to test our WindowsMachine with
 * whichever testing framework we choose.
 */
public class WindowsMachine {
    public Keyboard keyboard;
    public Monitor monitor;

    public WindowsMachine(Keyboard keyboard, Monitor monitor) {
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

}
