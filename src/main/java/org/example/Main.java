package org.example;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        double x, y, r;
//        r = 5;
//        x = in.nextDouble();
//        taskOne taskOne = new taskOne(x);
//        y = taskOne.resolveExpression();
//        boolean condRes = taskOne.isConditionExpression(x, y, r);
//        if(condRes) {
//            double scale = Math.pow(10, 3);
//            double result = Math.ceil(y * scale) / scale;
//            System.out.println(result);
//        }
//        else {
//            System.out.println(condRes);
//
//        }

//        taskTwo taskTwo =  new taskTwo(x);
//        double result = taskTwo.isConditions();
        System.out.println("Введите время падения камня: ");
        double t = in.nextDouble();
        taskThree taskThree = new taskThree();
        double res = taskThree.findDepth(t);
        System.out.println("Ширина злополучного колодца = " + Math.round(res) + " м.");
        System.out.printf("Ширина злополучного колодца = %d  м.", Math.round(res));

    }
}