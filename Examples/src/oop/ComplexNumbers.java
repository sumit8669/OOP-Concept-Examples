package oop;

public class ComplexNumbers {
    int a1,b1,a2,b2 ;
    int option;
    ComplexNumbers(int a,int b,int c,int d,int e){
        a1=a;
        b1=b;
        a2=c;
        b2=d;
        option= e;
    }
    public  void  compute(){

        if(option==1){

            int a= a1+a2;
            int b= b1+b2;
            Print(a,b);


        }
        if(option==2){

            int a= (a1*a2)-(b1*b2);
            int b= (a1*b2)+(b1*a2);
            Print(a,b);


        }
    }

    public  void Print(int a,int b){
        System.out.println(a+" + i"+b);
    }
}