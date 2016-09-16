package edu.orangecoastcollege.cs273.shippingcalculator;

/**
 * Created by jkloppenburg1 on 9/13/2016.
 */
public class ShippingCost {

    private int weight;
    private double baseCost;
    private double addedCost;
    private double totalCost;

    public ShippingCost() {
        this.baseCost = 3.00;
        this.addedCost = 0.0;
    }

    public ShippingCost(int weight, double baseCost, double addedCost, double totalCost) {
        this.weight = weight;
        this.baseCost = baseCost;
        this.addedCost = addedCost;
        this.totalCost = totalCost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;

        if (weight <= 16)
        {
            this.addedCost = 0.0;
        }
        else
        {
            int myWeight = weight - 16;
            while (myWeight > 0)
            {
                myWeight -= 4;
                this.addedCost += 0.5;
            }
        }

        this.totalCost = this.baseCost + this.addedCost;
    }

    public double getBaseCost() {
        return baseCost;
    }


    public double getAddedCost() {
        return addedCost;
    }


    public double getTotalCost() {
        return totalCost;
    }

}
