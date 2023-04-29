package com.single.responsibility.examples.student;

/***
 * The single responsibility principle states that every Java class must perform a single functionality.
 * Implementation of multiple functionalities in a single class mashup the code and if any modification is required
 * may affect the whole class. It precise the code and the code can be easily maintained.
 *
 * “One class should have one and only one responsibility”
 * "A class or function should only have one reason to change."
 *
 * How does this principle help us to build better software? Let's see a few of its benefits:
 * 1)	Testing – A class with one responsibility will have far fewer test cases.
 * 2)	Lower coupling – Less functionality in a single class will have fewer dependencies.
 * 3)	Organization – Smaller, well-organized classes are easier to search than monolithic ones.
 *
 *
 * Example 1
 * Suppose, Student is a class having three methods namely printDetails(), calculatePercentage(), and addStudent().
 * Hence, the Student class has three responsibilities to print the details of students, calculate percentages,
 * and database.
 * By using the single responsibility principle, we can separate these functionalities into three separate classes
 * to fulfill the goal of the principle.
 */
public class StudentWithMultipleResponsibilities {

    public void printDetails() {
        // functionality of the method to print details
    }

    public void calculatePercentage() {
        // functionality of the method to calculate percentage
    }

    public void addStudent() {
        // functionality of the method to add a student into database
    }

}
