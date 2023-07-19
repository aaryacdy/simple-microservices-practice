package com.arya.microservices.limitsservice.bean;

public class LimitConfiguration {
    private int minimum;
    private int maximum;

    //no args constructor
    protected LimitConfiguration() {
        
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum(){
        return minimum;
    }

    public void setMaximum(int max) {
        this.maximum = max;
    }

    public void setMinimum(int min) {
        this.minimum = min;
    }

    //constructor
    public LimitConfiguration(int max, int min) {
        this.maximum = max;
        this.minimum = min;
    }

}
