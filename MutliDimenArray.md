# Multi-Dimentional Arrays
- An array that contains other arrays as its elements
- the most common types if the two-dimentional (2D) array, which is used to store matrices or tabular data
# Declaring and Initializing a 2D array
## 1. Using the new keyword (fixed size)
    int[][] mat = new int[2][3];

- Creates a 2-row , 3-column matrix
- Default valus:
    - int: 0
    - boolean: false

## 2. Using Curly Brace {} syntax (Predefined values)
    int[][] mat = {
        {1,2,3},
        {4,5,6}
    };

- This directly initializes the 2*3 matrix with values

## 3. Declaring without specifying column size
    int[][] mat = new int[2][];

- You must initialize each row separately when you don't specify the number of columns
- This allows for jagged arrays (non-uniform row sizes)

# Memory Layout of a 2D array
    int[][] mat = {
        {1,2,3},
        {4,5,6}
    };

- The main array mat holds references to row arrays
- Each row array is stored separately in memory
- Each integer occupies 4 bytes(hence, address increment by 4)

# Accessing elements in a 2D array
    sout(mat[1][1]);

- You can access an element an element in a 2D array using row and column indices
- If an invalid index is accessed, Java throws an ArrayIndexOutOfBoundsException

# Printing a 2D array
    sout(Arrays.deepToString(mat));

- This prints the memory addresses of inner arrays , not the values

# Memory Layout of a 2D Jagged array
    int[][] mat = nw int[2][];
    mat[0] = new int[]{1,2,3};
    
- The main array mat holds references to row arrays
- Each row array can have different number of elements, intiallynull
- The first row of the array (mat[0]) is intialized with 3 elements : [1,2,3];