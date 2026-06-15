# Strings
In Java,  strings of the String class. They can be created in multiple ways.
# 1. Using the new Keyword
    String message = new String("hello");
    This explicity created a new object in memory, which is usually   
# 2. Preferred way
    String message = "hello";
- new String("hello") is redundant because Java automatically manages string literals efficiently
- When a string is assingned using a string literal, it is stored in the string pool

# String Pool
- A special memory area in the Java heap where string literals are stored
- Helps in optimising memory usage and improving performance by avoiding duplicate string objects

# How does String Pool work ?
- When you do (String message = "hello"), Java checks if the same string already exists in the String pool
- If it exits, Java simply references the existing string instead of creating a new object
- When using (new String("hello)), a new object is expilicitly created outside the string pool, which is why it is less efficient
# Eaxmple 
    String str1 = "hello";
    String str2 = "hello";
    sout(str1 == str2);  // true

    String str3 = new String("hello");
    sout(str1 == str3); //false

# Printing a String
    System.out.println(message);
- This prints the string stored in message to the console


