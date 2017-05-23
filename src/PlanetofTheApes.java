/**
 * Created by ronald on 16/01/17.
 */
public class PlanetofTheApes {

    String name;
    int age;


    PlanetofTheApes(){
        age = 20;
        System.out.println("Default constructor EXPLICIT!");
    }

    /**
     * Constructors are special methods that create and return an object of the class in which they are defined.
     * Constructors have the same name as the name of the class in which they are defined, and the don't specify
     * a return type - not even void!!
     *
     * You can use all the access modifiers on constructors eg. public, private, default or protected.
     *
     * A constructor can accomplish the following tasks:
     *      Call the base class's constructor: this can be an implicit or explicit call. {Default Constructor}
     *      Initialize all of the instance variables of a class with their default values. {Parametrized Constructor}
     */

    public static void main(String[] args) {
        PlanetofTheApes planetofTheApes = new PlanetofTheApes(); // <-- creating an object (blueprint of a class)
        System.out.println(planetofTheApes.age);
    }
}
