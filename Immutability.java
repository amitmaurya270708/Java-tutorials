public class Main{
    public static void main(String []args){
        String x = "Hello";
        String xNew = x.replace(oldChar : "l", replacement : "p");
        System.out.println(xNew);
        System.out.println(x);

        // performance overhead
        // String Concat : 38457750
        // String Concat : 2782917
        long start = System.nanoTime(); 

        String text = new StringBuilder();

        for(nt i = 0; i < 10_000; i++){
            text.append(i);
        }
        long end = System.nanoTime();

        System.out.println("Time taken with String Builder : " + (end - start));
    }
}