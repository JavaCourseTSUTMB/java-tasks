package org.example;

public class taskTwo {
    private double x;

    public taskTwo(double num) {
        x = num;
    }

    private double exp1(double x) {
        return Math.pow(x, 6) * Math.log10(Math.abs(Math.pow(6, x) - Math.pow(Math.abs(x - 5), x)));
    }
    private double exp2(double x) {
        return Math.sin(x / (1 - 2*x*x));
    }
    private double exp3(double x) {
        return Math.asin(1/Math.pow(x, 4));
    }

    public double isConditions() {
        if(this.x < -1) {
            return exp1(this.x);
        }
        else if(this.x >= -1 && this.x < 1) {
            return exp2(this.x);
        }
        else return exp3(this.x);
    }

}
