public class Escape{
    public static void main(String[] args) throws InterruptedException {
        // Escape Sequence Examples
        // 1. escaping double quotes
        String message = "Hello \"Ankit\"";
        System.out.println(message);

        // 2. escaping backslash
        // c:/Program Files\Java\jdk
        String winPath = "C:\\Program Files\\Java\\jdk";
        System.out.println(winPath);

        // 3. newline
        String story = "This is a story about a king and a queen. \n King wins at the end";
        System.out.println(story);

        // 4. tab
        String text = "Hello\tWorld";
        System.out.println(text);

        // 5. '
        char singleQuote = '\'';
        System.out.println(singleQuote);

    } 
}