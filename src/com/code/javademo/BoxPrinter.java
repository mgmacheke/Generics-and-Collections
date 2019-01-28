package com.code.javademo;

// The program demonstrates "Object" based implementation and associated lack of type safety
public class BoxPrinter {

    // an object that holds the val
    private Object val;

    // constructor that takes the object val
    public BoxPrinter(Object val){
        this.val = val;
    }

    // add a get value method
    public Object getVal(){
        return val;
    }

    // override the toString method
    @Override
    public String toString(){
        return "[" + val + "]";
    }

    public static void main(String[] args) {
        // create a BoxPrinter1 that takes a Integer object
        BoxPrinter boxPrinter1 = new BoxPrinter(new Integer(10));

        // print the BoxPrinter1
        System.out.println(boxPrinter1);

        // cast boxPrinter1 to a integer object
        Integer integer1 = (Integer) boxPrinter1.getVal();

        // create a BoxPrinter1 that takes a String object
        BoxPrinter boxPrinter2 = new BoxPrinter("Hello World");

        // print the BoxPrinter1
        System.out.println(boxPrinter2);

        // cast boxPrinter1 to a integer object
        Integer integer2 = (Integer) boxPrinter2.getVal();
    }
}
