package com.company;

/**
 * A class that represents healthy burger and extends the basic burger
 */
public class HealthyBurger extends BaseBurger{


    private String healthyAddition4;
    private double healthyAddition4Price;
    private String healthyAddition5;
    private double healthyAddition5Price;

    /**
     * A constructor that initialize healthy hamburger
     * @param meat - sets the type of meat
     * @param price - sets the price of the burger
     */
    public HealthyBurger(String meat, double price) {
        super("Healthy", "brown", meat, price);
    }

    /**
     * A method that adds extra additions to the healthy burger
     * @param name - addition's name
     * @param price - addition's price
     */
    public void addHealthyAddition4(String name, double price){
        this.healthyAddition4 = name;
        this.healthyAddition4Price = price;
    }

    /**
     * A method that adds extra additions to the healthy burger
     * @param name - addition's name
     * @param price - addition's price
     */
    public void addHealthyAddition5(String name, double price){
        this.healthyAddition5 = name;
        this.healthyAddition5Price = price;
    }

    /**
     * A method that overrides the method from the super class
     * and calculates the price of the healthy burger
     * @return - healthy burger's price
     */
    @Override
    public double calculateBurgerPrice() {
        double healthyBurgerPrice = super.calculateBurgerPrice();
        if(healthyAddition4 != null){
            healthyBurgerPrice = healthyBurgerPrice + healthyAddition4Price;
            System.out.println("Added " + healthyAddition4 + " and the price now is: " + healthyBurgerPrice);
        }
        if(healthyAddition5 != null){
            healthyBurgerPrice = healthyBurgerPrice + healthyAddition5Price;
            System.out.println("Added " + healthyAddition5 + " and the price now is: " + healthyBurgerPrice);
        }
        return healthyBurgerPrice;
    }
}
