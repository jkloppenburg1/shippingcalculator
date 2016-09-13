package edu.orangecoastcollege.cs273.shippingcalculator;

/**
 * Created by jkloppenburg1 on 9/13/2016.
 */
public class ShippingCost {

    private double weight;
    private double baseCost;
    private double addedCost;
    private double totalCost;

    public ShippingCost() {
        this.baseCost = 3.00;
        this.addedCost = 0.0;
    }

    public ShippingCost(double weight, double baseCost, double addedCost, double totalCost) {
        this.weight = weight;
        this.baseCost = baseCost;
        this.addedCost = addedCost;
        this.totalCost = totalCost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getAddedCost() {
        return addedCost;
    }

    public void setAddedCost(double addedCost) {
        this.addedCost = addedCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
