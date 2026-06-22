public class OperatorPrecedence{
    public static void main(String[] args){
        //  Operation Order
        int result = 20 - 4 + 6 / 2;

        System.out.println(result);

        result = (20 - 4 + 6) / 2;

        System.out.println(result);
    }
}