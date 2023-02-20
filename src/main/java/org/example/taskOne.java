package org.example;

public class taskOne {
    private double x;

    public double log2(double x) {
        return (Math.log(x) / Math.log(2));
    }

    public taskOne(double num) {
        x = num;
    }

    public double resolveExpression() {
        return Math.asin(Math.pow(
                (Math.sqrt(Math.abs(x)) / (Math.sqrt(Math.abs(x)) + 1)), 5))
                 + Math.pow(x*x + 1, 0.2)
                 + log2(Math.pow(2, Math.sin(x)) + Math.pow(Math.abs(x), Math.cos(x)));
    }


    public boolean isConditionExpression(double x, double y, double r) {
        return (Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r, 2)) && (y >= 0);
    }
}


