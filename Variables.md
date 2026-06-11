# What is a variable ?
- A container for storage data values
- Variables allow us to name data and use it thoughout the program

# Declaring a variable
### Syntax
    type name < identifier > = < assignment operator> initialValue;
### Example
    int score = 100;
- Type specifies the kind of data that variable will stre (int)
- Identfier : The name of the variable (score)
- Intial Value : The value assigned to the variable at the time of declaration (100)
# Rules :
- No decimal point in integers
   - Integer types (int) store only whole numbers (100)
- Initialisation requirement
    - variable must be initialized before reading their values

            int score = 100;
            System.out.println(score);

- Changing variable values
    - Variables can be updated after initialisation

            int score = 100;
            score = 150;

- Assigning vaues between variables
    - You can assign the value of one variable to another

            int score = 100;
            int finalScore = score;

- Declaring multiple variables
    - Multiple variable of the sametye can be declared in one line, seprated by commas

            int score = 100, level = 5;

However, it is better to declare variables separately for better redability and maintainability

    int score = 100;
    int level = 5;
    









