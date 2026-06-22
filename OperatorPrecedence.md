### Arithmetic expessions follow a specific order of operations

Determines which operations are performed first in a mathematical operation

    int result = 8 + 4 * 3;

.        
            
    Parentheses
    Exponents
    Multiplication Division
    Addition Subtraction

# BODMAS / PEMDAS rule
Certain operators are evaluted before others
## General Order
Parentheses()      
Operations inside parentheses are evaluted first

Multiplication *, Division /, Modulus %        
Have higher precedence than addition and subtraction

Addition +, Subtraction -             
Evaluted last , unless overriden by parentheses

    int result = 8 + 4 * 3;


Multiplication first: 4 * 3 = 12
Addition: 8 + 12 = 20
Result = 20

# Using parentheses to change precendence
    int result = 8 + 4 * 3;

We want addition to be evaluated first...

    int result = (* + 4) * 3;

Parentheses first: 8 + 4 * 12
Multiplication : 12 * 3 = 36
Result = 36

## Parentheses override default precedence

### Examples

    int result = 20 - 4 + 6 / 2;
.
    int result = (20 - 4 + 6) / 2;
    