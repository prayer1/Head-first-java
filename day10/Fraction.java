package com.day10;

public class Fraction {
    int a;
    int b;
    Fraction(int a, int b){
        this.a = a;
        this.b = b;
    }

    double toDouble(){
        return (double)(a)/b;
    }
    Fraction plus(Fraction r){
        int B = this.b * r.b;
        int A = this.a * r.b + r.a * this.b;
        return new Fraction(A, B);
    }
    Fraction multiply(Fraction r){
        int B = this.b * r.b;
        int A = this.a * r.a;
        return new Fraction(A, B);
    }
    void  print(){
        if((double)a/b == 1){
            System.out.println(1);
        } else if (a % b == 0){
            a = a / b;
            b = 1;
            System.out.println(a);
        } else if(b % a == 0){
            b = b / a;
            a = 1;
            System.out.println(a + "/" + b);
        } else {
            System.out.println(a + "/" + b);
        }
    }
}
