package com.dependency.inversion.examples.windows.problem;

/***
 * Let's understand the principle through an example.
 * class WindowsMachine {
 * 	//functionality
 * }
 * It is not worth, if we have not keyboard and monitor to work on Windows. To solve this problem,
 * we create a constructor of the class and add the instances of the keyboard and monitor.
 * After adding the instances, the class looks like the following:
 *  --Check the below class.
 *
 *  Now we can work on the Windows machine with the help of a keyboard and monitor.
 * Problem solved? Not quite. By declaring the StandardKeyboard and
 * StandardMonitor with the new keyword, we've tightly coupled these three classes together.
 * Not only does this make our WindowsMachine hard to test, but we've also lost the ability to
 * switch out our StandardKeyboard class with a different one should the need arise.
 * And we're stuck with our Monitor class too.
 * Let's decouple our WindowsMachine from the StandardKeyboard and StandardMonitor
 * by adding a more general Keyboard & Monitor interfaces and using these in our class:
 *
 * --Check in solution section.
 *
 */
public class WindowsMachine {
    public StandardKeyboard keyboard;
    public StandardMonitor monitor;

    public WindowsMachine() {
        monitor = new StandardMonitor();  //instance of monitor class
        keyboard = new StandardKeyboard(); //instance of keyboard class
    }

}
