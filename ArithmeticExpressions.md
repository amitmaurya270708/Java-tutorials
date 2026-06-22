# Expression
Combination of operands ( values or variables) and operators (symbols) that computes a result
    
        int result = 10 + 3;

# Operators and their meanings
Addition (+) Adds two numbers       
Subtraction (-) Difference between two numbers       
Multiplication (*) Multiplies two numbers      
Division (/) Divides one number by another      
Modulo (%) Returns the reminder after division    
# Division (/)
When both operands are integers, the result is also an integer
    int result = 10/3;

Expected output: 3.333...
Actual output : 3

# The fractional part is discarded
### Be cautions with integer division, as it may lead to precision loss
To get a precise result, cast onw or both operands to a floating point type (double or float )

# Modulo (%)
Return remainder after dividing the first operand by second     
            
            int result = 10 % 3;

## Check if a number is add or even
# Behaviour with negative numbers
The result of a % b has same sign as a 
   
    int result = -10 % 3;  //-1

# Increment Operators
Two forms of increment operator (increases value of variable by 1)

## Postfix Increment (x++)

        int x = 1;
        int y = x++;
        // x -> 2, y -> 1

# Compound Assignment Operators
Shorthand way to perform an operation on a variable and assign the result back to same variable

    x = x + 2;
    x += 2;

# One difference between them 

    byte x = 1;
    x = x + 2;

    x =+ 2;

Everything is same. At last (x+2) is implicitly casted to byte type
