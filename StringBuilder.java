class StringBuilder{
    public static void main(String[] args){
        // StringBuilder examples
        StringBuilder sb = new StringBuilder();
        Syatem.out.println(sb.length()); // 16
        sb.append("hello");
        System.out.println(sb.length()); // 5
        System.out.println(sb.capacity()); // 16
        sb.append("hello");
        sb.append("hello");
        sb.append("hello");
        System.out.println(sb.capacity());

        sb = new StringBuilder("hello");
        sb.append("World");
        Syatem.out.println(sb.toString()); // hello World
        
        // insert in a stringbuilder
        // sb -> hello World
        sb.insert(offset: 6, str: "Java");
        System.out.println(sb.toString());

        // replacing characters or substrings in stringbuilder
        // sb -> hello Java World
        // 
        sb.replace(start : 6, end : 16, str : "Pyton" );
        System.out.println(sb.toString());

        // Deleting characters
        // sb -> hello Phython World
        //
        sb.delete(6,13);
        System.out.println(sb.toString()); 

        // reversing
        // sb -> hello World
        sb.reverse();
        System.out.println(sb.toString()); 
    
        // performance of appending in string vs stringbuilder
        long start = System.out.nanoTime();

        String s = "";

        for(int i = 0; i < 10_000; i++){
            s = s + i;
        }
        System.out.println(s.length()); 
        
        end = Syatem.nanoTime();
        System.out.println((end - start)); // 40632166
                                            // 892042

    }
}