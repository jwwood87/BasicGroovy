/**
 * Created by John on 10/6/2015.
 */
class Person {
    String firstName
    String lastName
    int age
    def address

    void fullName(){
        println("The full name is: " + firstName + " " + lastName)

    }
}