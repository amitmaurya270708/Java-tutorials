# String Immutability
- It means that once a string object is created in Java, its value cannot be changed
- Any modification to a string results in the creation of a new string object rather than modifying the exiting one
# Why are string immutable ?
## 1. Memory Optimisation (String Pooling)
## Example 
    String str1 = "hello";
    String str2 = "hello";
    sout(str1 == str2); // true

    String str3 = new String ("heelo");
    sout(str1 == str3); // false

- helps save memory and avoid redundant string objects

## 2. Security
- Strings are widely used security-sensitive operations (e.g., File paths, database connections, etc).
- If a string were mutable, data that it is pointing to could be changed, leading to security vulnerabilities

   
    
        public class SecurityExample{
            public static void main(String[] args){
                String password = "Secret123";
                authenticate(password);

            // an attacker attempts to change the password
            password.change("HackedPassword"); // not possible

            // an attacker attempts to change tthe password reference 
            // this only changes the reference, not the original value
            // used in authentication
            password = "HackedPassword";
            }
            private static void authenticate(String password){
                if(password.equals("Secret123")){
                    sout("Access Granted");
                }
                else{
                    sout("Access Denied");
                }
            }
        }

# How String immutability works
    String str1 = "hello";
    str1 = str1 = "World";
    sout(str1); // Hello World

- str1 initially refers to "hello"
- when we concatenate "World", a new String object is created with "Hello World"
- The referrence str1 now points to the new object, while the original "hello" remains unchanged in memory

# Disadvantages
## 1. High Memory Usage
    String text = "":
    for(int i = 0; i < 1000; i++>){
        text += i;
    }
    sout(text.length());

- in each iteration, a new string object is created, consuming more memory
- inefficient as Java constantly allocates and decollocates memory for each new string object

## 2. Performance Overhead
    long start = System.nanotime();
    String text = "":
    for(int i = 0; i < 10000; i++){
        text += i;
    }
    long endTime = System.nanoTime();
    sout(endTime - StartTime);

- Frequent modications create temporary objects, which may impact performance

    long start = System.nanoTime();
    StringBuilder text = new StringBuilder();
    for(int i = 0; i < 10000; i++){
        text.append(i); // efficient modification in place  
    }
    long endTime = System.nanoTime();
    sout(endTime - startTime);

- Using StringBuilder reduces memory consumption and execution time, making it the preferred approach for frequent modifications
















