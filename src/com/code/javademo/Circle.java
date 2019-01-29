package com.code.javademo;

import java.util.HashSet;
import java.util.Set;

public class Circle {
    // create 3 var
    private int xPos, yPos, raduis;

    // create a constructor
    public Circle(int xPos, int yPos, int raduis){
    this.xPos = xPos;
    this.yPos = yPos;
    this.raduis = raduis;
    }

    // use the equal method
    public boolean equal(Object arg){
        if(arg == null) return false;
        if(this == arg) return true;
        if(arg instanceof Circle){
            Circle that = (Circle) arg;
            if((this.xPos == that.xPos) && (this.yPos == that.yPos) && (this.raduis == that.raduis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Set<Circle> circles = new HashSet<>();
        circles.add(new Circle(10,20,30));
        System.out.println(circles.contains(new Circle(10,20,30)));

    }
}
