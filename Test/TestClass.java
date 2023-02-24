package test;

import oop.Fraction;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction f1 = new Fraction(sc.nextInt(), sc.nextInt());
        int t  = sc.nextInt();
        while (t > 0){
            int n = sc.nextInt();
            if (n == 1){
                f1.Add(f1,new Fraction(sc.nextInt(), sc.nextInt()));
                f1.Print();
            } else if (n==2) {
                f1.Multiply(f1,new Fraction(sc.nextInt(), sc.nextInt()));
                f1.Print();
            }
            t--;
        }
    }

}
