package task1;

public class Complex {
    private int real;
    private int imaginary;

    // TODO: Add constructors
    public Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex(Complex complex) {
        this.real = complex.real;
        this.imaginary = complex.imaginary;
    }

    // TODO: Add getters and setters

    public int getReal() {

        return real;
    }

    public void setReal(int real) {

        this.real = real;
    }

    public int getImaginary() {

        return imaginary;
    }

    public void setImaginary(int imaginary) {

        this.imaginary = imaginary;
    }

    // TODO: Add addWithComplex
    void addWithComplex(Complex number) {
        this.real += number.real;
        this.imaginary += number.imaginary;
    }

    // TODO: Add showNumber
    void showNumber() {
        if (imaginary > 0) {
            System.out.println(real + " + i * " + imaginary);
        } else if (imaginary < 0) {
            System.out.println(real + " - i * " + -imaginary);
        } else {
            System.out.println(real);
        }
    }
}
