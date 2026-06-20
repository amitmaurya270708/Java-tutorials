import java.util.Arrays;
class Person{
    String name;

    Person(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
public class ArraysReference{
    public static void main(String[] args) throws InterruptedException{
        // Arrays - Reference
        Person[] persons = new Person[5]; 
        
        // Stack : persons, Heap : [null, null, null, null, null];
        // System.out.println(person[0]);

        persons[0] = new Person("Alice");

        System.out.println(persons[0]);
        // Stack: persons, heap: [null, null, null, null, null] : ref1 : Person("Alice")
        
        // System.out.println(person[1]);
        // Stack: persons, heap: [null, null, null, null, null] : ref1 : Person("Alice")


        persons[2] = new Person("Bob");
        // Stack: persons, heap: [null, null, ref2, null, null] : 
        // Heap : ref1 : Person("Alice"), ref2: Person("Bob")
        System.out.println("-----------");
        System.out.println(persons[0]);
        System.out.println(persons[1]);
        System.out.println(persons[2]);
        System.out.println(persons[3]);
        System.out.println(persons[4]);


    }
} 