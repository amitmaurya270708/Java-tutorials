# Variables
- Names storage locations in memory whose values can change during the execution of a program 
- i.e., a variable can be assigned a value, then later updated as the program runs
    int age = 15;
    // ... after five years 
    age = 20;

# Constants
- A special type of variable that is initialized with a value and cannot be changed once set
- Ensures its value remains fixed, protecting your program from unintended modifications

# Benefits
- Safety
    - Prevents accidental changes that can lead to calculation errors or logical bugs
- Readability
    - a well-named constant (like GRATIVY) makes it clear that the value is not expected to change,improving code readability
- Maintainability
    - If the value needs to be changed in multiple places, updating it in one location( if it were not a constant) would be error prone. Constants avoid this issue by disallowing changes
- Optimisation 
    - Somecompilers can optimise code better when it knows that certain values won't change

# Declarng a constant
    final float GRAVITY = 9.8f;
    GRAVITY = 1.8f; // line 2

- We prevent any accidental modifications, ensuring al related calculations use the correct value
- Line 2 would cause a complilation error, ensuring the value remains consistent 
    float GRAVITY = 9.8f;
    // some calculations...
    GRAVITY = 9.81f;
    // someone changed it and thought 9.81 is correct
    // wrong calculations...

# Memory Layout of a constant
    final float GRAVITY = 9.8f;


//

    final float GRAVITY;
    GRAVITY = 9.8f;

- The main array mat holds references to row arrays
- Each row array is stored separately in memory
- Each integer occupies 4 bytes (hence, address increments by 4)