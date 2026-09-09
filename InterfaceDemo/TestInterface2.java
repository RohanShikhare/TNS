package com.tns.interfacedemo;

interface Printable{
    void print();
}
interface Showable{
    void show();
}
public class TestInterface2 implements Printable, Showable{
    public void print(){System.out.println("This is print() method");}
    public void show(){System.out.println("This is show() method");}

    public static void main(String args[]){
        TestInterface2 obj = new TestInterface2();
        obj.print();
        obj.show();
    }
}