class Primitive{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool; 
   byte b1=10;
    short s1=20;
    int i1=30;
    long l1=5000;
    float f1=200.1f;
    double d1=322348.657;
    char c1='A';
    boolean bool1=true;

    void printDefaults() {
        System.out.println("Default values of primitive data types in Java:");
        System.out.println("byte: " + b+ "short: " + s+ "int: " + i+ "long: " + l + "float: " + f+"double: " + d +"char: '" + c + "' (empty character)"+"boolean: " + bool  );
System.out.println("byte: " + b1+ "short: " + s1+ "int: " + i1+ "long: " + l1 + "float: " + f1+"double: " + d1 +"char:" + c1 + "boolean: " + bool1  );


    }

    public static void main(String[] args) {
        Primitive s = new Primitive();
        s.printDefaults();
    }
}
