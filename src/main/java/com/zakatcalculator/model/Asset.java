package com.example.zakatcalculator.model;

public class Asset {
    private int assetCode;
    private String type;
    private double value;

    public Asset() {}
    public Asset(String type, double value) {
        this.type = type;
        this.value = value;
    }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }
}