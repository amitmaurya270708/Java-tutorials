    Person p = new Person();

# What are reference types ?
- Types that store reference ( or memory adddresses ) to objects rather than the actual data

| Primary Memory | Secondary memory |
|----------------|------------------|
| x = 100        | [0 * 10001 : Person Object ] <br> name = null<br> age = 0; |
| p = 0 * 1001 (reference) |  |

# Key Points :
- Store Memory Addresses 
    - A reference variable store the address of an object rather than the actual data
    - the object itself resides in the secondary memory, while the reference is stored on the stack


| Primary Memory | Secondary memory |
|----------------|------------------|
| x = 100        | [0 * 10001 : Person Object ] <br> name = null<br> age = 0; |
| p = 0 * 1001 (reference) |  |

- Support Complex Data
    - Reference types allow the creation and manipulation of complex objects like arrays, classes, etc

            Classes
            Arrays
            Strings
            Custom Objects 

- Null Values
    - A reference variable can hold null, indication that it doesn't correctly point to any object

            Person p = null;

- Default values
    - The default value of an uninitialised reference type is null

            Person p;














