
class Complex {
    private double real;
    private double imaginary;

 
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }
    public Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

  
    public Complex multiply(Complex other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realPart, imaginaryPart);
    }

    
    public void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }
}


public class ComplexDemo {
    public static void main(String[] args) {
      
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(4, -2);

 
        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        Complex product = c1.multiply(c2);
        System.out.print("Product: ");
        product.display();
    }
}
