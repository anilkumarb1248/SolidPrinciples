package com.liskov.substitution.examples.car.problem;

/***
 * Liskov substitution principle says "if class A is a subtype of class B,
 * we should be able to replace B with A" without disrupting the behavior of our program.
 *
 * “Derived types must be completely substitutable for their base types”
 *
 * The Liskov Substitution Principle (LSP) was introduced by Barbara Liskov.
 * It applies to inheritance in such a way that the derived classes must be completely
 * substitutable for their base classes. In other words, if class A is a subtype of class B,
 * then we should be able to replace B with A without interrupting the behavior of the program.
 *
 * It extends the open-close principle and also focuses on the behavior of a superclass and its subtypes.
 * We should design the classes to preserve the property unless we have a strong reason to do otherwise.
 */

/***
 * Here we define a simple Car interface with a couple of methods that all cars should be able to
 * fulfill: turning on/off the engine and accelerating forward.
 *
 * As our code describes, we have an engine that we can turn on, and we can increase the power.
 * But wait — we are now living in the era of electric cars.
 * So the electric cars can not have the engine. So we need to throw exception from the turnOn/Off methods.
 * By throwing a car without an engine into the mix, we are inherently changing the behavior of our
 * program. This is a blatant violation of Liskov substitution and is a bit harder to fix than our
 * previous two principles.
 */

/***
 * We can think that the accelerate() is for all the cars like MotorCar and ElectricCar.
 * Create another interface which having accelerate() and extends the Car interface with newly
 * created interface.
 *
 * interface ICar{
 *     accelerate();
 * }
 *
 * interface Car extends ICar{
 *     turnOn();
 *     turnOff();
 * }
 *
 * class MotorCar implements Car{}
 *
 * And implements the ElectricCar with ICar not Car interface. No changes for MotorCar.
 *
 * class ElectricCar implements ICar{}
 *
 * Now the MotorCar type can be replaced with its base type “Car” and the ElectricCar can be
 * replaced with its base type “ICar”. This is perfect Liskove Substitution Principle.
 *
 */
public interface Car {

    public void startEngine();
    public void accelerate();

    public void stopEngine();
}
