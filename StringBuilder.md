 # String Builder
- Mutable sequence of characters used for efficient string mnanipulation in Java
- Allows modifications without creating new objects, improving performance when frequent changes are required

# Creating a StringBuilder Object
    StringBuilder sb = new StringBuilder("hello");

- This initializes a StringBuilder object with string "hello"

# Common Methods of StringBuilder
## 1. Apppending Strings
    StringBuilder sb = new StringBuilder("hello");
    sb.append("World");
    sout(sb.toString());

- append() adds new content at the end without creating a new object

## 2. Inserting at a specific index
    StringBuilder sb = new StringBuilder("hello");
    sb.insert(5, "Java");
    sout(sb.toString());

- insert(index,value) inserts text at the given position
# 3. Replacing characters or substrings
    StringBuilder sb = new StringBuilder("hello World");
    sb.replace(6,11,"Java");
    sout(sb.toString());
- replace (start,end,value) replace characters between indices start and end

# 4. Deleting 
    StringBuilder sb = new StringBuilder("hello World");
    sb.delete(5,10);
    sout(sb.toString);

-delete(start, end)removes characters in the given range  

# 5. Reversing a string 
    StringBuilder sb = new StringBuilder("hello World);
    sb.reverse();
    sout(sb.toString());

- reverse() reverses the characters in the StringBuilder

# 6. Finding capacity and ensuring efficiency

    StringBuilder sb = new StringBuilder();
    sout(sb.capacity()); // 16