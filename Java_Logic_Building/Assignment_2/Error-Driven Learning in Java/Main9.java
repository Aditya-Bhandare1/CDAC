public class Main9 { 
    public static void main(String[] args) { 
        int cl = 10; 
        System.out.println(cl); 
    } 
} 
 

/*Main9.java:3: error: not a statement
        int class = 10;
        ^
Main9.java:3: error: ';' expected
        int class = 10;
           ^
Main9.java:3: error: <identifier> expected
        int class = 10;
                 ^
Main9.java:4: error: <identifier> expected
        System.out.println(class);
                          ^
Main9.java:4: error: illegal start of type
        System.out.println(class);
                           ^
Main9.java:4: error: <identifier> expected
        System.out.println(class);
                                ^
Main9.java:6: error: reached end of file while parsing
}

Any keyword (reserve words) cannot be used as a varible name in java, as they have some special meaning to the compiler.
 ^
7 errors*/