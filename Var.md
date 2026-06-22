# Var
- Enables local variable type inference, allowing you to omit the explicit type declaration
- helps reduce verbosity and improve code readability by letting the compliler deduce the variable's type from the initializer
# How does var work ?
## 1. Type Inference
- The compiler infers the variable's type based on the exprssion assigned to it
    var count = 10; // inferred as int
    var name = "Java" // inferred as String

## 2. Mandatory Initializer
- You must initialize a variable declared with var so that the compiler has enough information to determine its type
    var value; // Compiler-time error

# Scope and limitations
## 1. Local variables only 
- Inside methods, loops, or code blocks
## 2. Not for class fields or method signatures
- Not for instance variables, method parameters or return types
## 3. Readability Considerations
- var can simplify code, overusing it may lead to ambiguity if the inferred type is not immediately obvious

# Benefits
## 1. Conciseness
- Reduces boilerplate code
    var persons = new Person[10];

## 2. Improved readability
- When used judiciouly, it makes code cleaner by removing redundant type declarations