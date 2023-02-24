package oop;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator , int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        Simplify();
    }

    public void Add(Fraction f1, Fraction f2){
        f1.numerator = f1.numerator*f2.denominator +f2.numerator* f1.denominator;
        f1.denominator = f1.denominator * f2.denominator;
        Simplify();
    }

    public void Multiply(Fraction f1 , Fraction f2){
        f1.numerator = f1.numerator * f2.numerator;
        f1.denominator = f1.denominator* f2.denominator;
        Simplify();
    }

    public void Print(){
        System.out.println(numerator +"/"+ denominator);
    }

    private void Simplify(){
        int gcd = gcd(numerator, denominator);

        this.numerator /=gcd;
        this.denominator /=gcd;

    }

    private   int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
