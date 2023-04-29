package com.open.closed.examples.guitar;

/***
 * The open-closed principle says “classes should be open for extension but closed for modification”.
 * In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an application.
 *
 * Of course, the one exception to the rule is when fixing bugs in existing code.
 *
 * “Software components should be open for extension, but closed for modification”
 * It means that the application classes should be designed in such a way that whenever fellow developers want to
 * change the flow of control in specific conditions in application, all they need to extend the class and override
 * some functions and that’s it.
 */

/***
 * Let's explore the concept with a quick code example. As part of a new project, imagine we've implemented a Guitar class.
 * It's fully fledged and even has a volume knob:
 *
 * We launch the application, and everyone loves it. But after a few months, we decide the Guitar is a little boring
 * and could use a cool flame pattern to make it look more rock and roll.
 * At this point, it might be tempting to just open up the Guitar class and add a flame pattern — but who knows
 * what errors that might throw up in our application.
 * Instead, let's stick to the open-closed principle and simply extend our Guitar class into SuperCoolGuitarWithFlames
 * By extending the Guitar class, we can be sure that our existing application won't be affected.
 */
public class Guitar {
    private String make;
    private String model;
    private int volume;

    // Constructors, getters & setters

}
