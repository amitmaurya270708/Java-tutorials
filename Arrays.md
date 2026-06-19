# Arrays
- Collection of elements of the same data type store in contiguous memory location
- Refference types

# Declearing and Initializing Arrays
## 1. Using new keyword (Fixe size)
    int[] numbers = new int[5];
    
- Creates an integer array with 5 elements
- The arrray is initializing with default values(0)

# 2. Using an array literal (Predefined values)
    int[] numbers = [2,3,4,6,1];

- Directly initializes the array with values and determines the size automatically

# Memory Layout Of an array in Java 
    int[] numbers = {2,3,4,6,1};

- Each int typically takes 4 butes, so the next index is stored at +4 bytes
- The array data itself (numbers) is stored elsewhere in memory (heap) while the reference lives in the stack

# Accessing and modifying array elements
_ Array indexing starts from 0
- Yu can access or modify an elements using its index
    numbers[1] = 100;   
    sout(numbers[2]);

# Out of bounds access
- if you try to access an index beyond the array size, Java throws an eeption
     numbers[10] = 100;
    
# Printing an array 
    sout(numbers);

- Prints memory address, not the actual values

    sout(Arrays.toString(numbers));
- Prints actual elements

# Array properties and methods
## Finding array length
     sout(numbers.length);

## Sorting an array
    Arrays.sort(numbers);
