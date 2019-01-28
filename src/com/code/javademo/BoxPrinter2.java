package com.code.javademo;

// this program demostrates the type-safety feature of generics
public class BoxPrinter2<T> {
    // an object that holds the val
    private T val;

    // constructor that takes the object val
    public BoxPrinter2(T val){
        this.val = val;
    }

    // add a get value method
    public T getVal(){
        return val;
    }

    // override the toString method
    @Override
    public String toString(){
        return "[" + val + "]";
    }

    public static void main(String[] args) {
        // create a BoxPrinter1 that takes a Integer object
        BoxPrinter2<Integer> boxPrinter1 = new BoxPrinter2<>(new Integer(10));

        // print the BoxPrinter1
         System.out.println(boxPrinter1);

        // cast boxPrinter1 to a integer object
        Integer integer1 =  boxPrinter1.getVal();

        // create a BoxPrinter1 that takes a String object
         BoxPrinter2<String> boxPrinter2 = new BoxPrinter2<>("Hello World");

        // print the BoxPrinter1
        System.out.println(boxPrinter2);

        // cast boxPrinter1 to a integer object
      //  Integer integer2 = boxPrinter2.getVal();
    }
}
