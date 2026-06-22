public class Airthmetic{
    public static void main(String[] args){
        // Airthmetic Expressions
        int result = 10 + 20;
        System.out.println(result);

        // divisiom
        result = 10 / 3; // 3.3333
        System.out.println(result);
        double result2 = (double)10/3;
        System.out.println(result2);

        // modulo operator
        int modRes = 10 % 6;
        System.out.println(modRes);

        modRes = -10 % 6;
        System.out.println(modRes);

        // even or odd
        int number = 100;

        if (number % 2 == 0){
            System.out.println("It's an even number");
        }

        if (number % 2 == 1){
            System.out.println("It's an odd number");
        }

        // increment operators 
        int x = 1;
        int y = x++;
        System.out.println(x); // 2
        System.out.println(y); // 1

        x = 1;
        y = ++x; // postfix
        System.out.println(x); // 2
        System.out.println(y); // 1

        byte z = 5;
        // z = z + 1;
        z += 1;
    }
}