# Arrays - Reference
## Memory Layout of an array in Java
    int[] numbers = {2,3,4,6,1};

## Arrays of reference types in Java
    Person[] persons = new Person[5];

- The variable persons resides in the stack
- The Array itself is created in the heap
- Initially, all elements in the array are null because no Person objects have been instantiated yet
## Creating objects
    persons[0] = new Person("Alice");
    persond[2] = new Person("Bob");

- Memory addresses are added pointing to the actual Personobjects in the Heap
- The uninitialized elements (person[1], persons[3], person[4]) remain null