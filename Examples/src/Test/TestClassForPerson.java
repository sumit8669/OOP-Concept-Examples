package Test;

import oop.Person;

import java.util.Scanner;

public class TestClassForPerson {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        Person p = new Person();
        p.SetValue(name, age);
        p.GetValue();
    }
}