package org.example;

public class taskThree {
    private double g = 9.8;
    public double v_sound = 300;

    public double findDepth(double t) {
       double t_d = (-v_sound + Math.sqrt(Math.pow(v_sound, 2) + 2*g*v_sound*t)) / g;
        return g*Math.pow(t_d, 2) / 2;
    }
}
