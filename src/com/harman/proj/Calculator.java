package com.harman.proj;

import java.util.Scanner;

class Addition extends Thread {
    int x, y;
    public Addition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void run() {
        try {
            System.out.println("ADDITION OF GIVEN NUMBER :");
            System.out.println(x + y);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class Subtraction extends Thread{
    int x, y;

    public Subtraction(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void run() {
        try {
            System.out.println("SUBTRACTION OF TWO NUMBERS :");
            System.out.println(x - y);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class Multiplication extends Thread{
    int x, y;

    public Multiplication(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void run() {
        try {
            System.out.println("MULTIPLCATION OF TWO NUMBERS :");
            System.out.println(x * y);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class Division extends Thread{
    int x, y;
    public Division(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void run() {
        try {
            System.out.println("DIVISION OF TWO NUMBERS :");
            System.out.println(x / y);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("enter the value of a: ");
        a = input.nextInt();
        System.out.println("enter the value of b: ");
        b = input.nextInt();

        Addition aobj = new Addition(a, b);
        Subtraction sobj = new Subtraction(a, b);
        Multiplication mobj = new Multiplication(a, b);
        Division dobj = new Division(a, b);

        aobj.start();
        sobj.start();
        mobj.start();
        dobj.start();
    }
}