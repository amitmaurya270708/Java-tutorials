# Function in Java :

A block of ends that perform a specific task and can be called when needed.

### Syntax :

```java
    ReturnType functionName(){
        // functiob body
    }
```

### Example :-
```java
    int addNumbers(){    
        return 5+3;
    }
```
    

# Void Function : A Function with no return type

### Syntax : 
```java
void functionName(){
    // function body
}
```

### Example
```java
    void displayMessage(){
        System.out.println("hey");
    }
```
# Main Function
Every java program must have at least are function, and the entry point of the program is the main() function.

```java 
    public static void main(String []args){
        // code excution starts here
    }
```
# Class in Java 
A class is a contianer that groups related functions ( methids) and data (variables)
### Syntax :
```java
    class ClassName{
        // class body
        void methodName(){
            // methodBody
        }
    }
```
### Example
```java
    class Calculator{
        int add(inta, int b){
            return a+b;
        }
        void displayMessage(){
            System.out.println("Hey);
        }
    }
```
# Access Modifiers
Control the visibility and accessibility of classes, methods and variables.    
We will discuss more on this later :)

# Naming Convention


```java
class CalculatorAdd{
    int add(int a,int b){
        return a+b;
    }
    void displayMessage(){
        System.out.println("Hey");
    }
}
```
Here above,  "displayMessage" is in "camelCase"    
And  "CalculatorAdd" in "PascalCase"
 
# Let's see our program :
```java
public class Main{
    public static void main(Strings []args){
        System.out.println("Hello from Main!");
    }
}
```
1. Is class Main necessary ?
- Yes, Jav does not allow function outside a class.    
(Pure OOP Language, No global functions, better modularity, etc. )

2. What is static ?
- Will discuss this in a later vedio .

3. What is public ?
- Access modifier, Again, will discuss in a later vedio . 








