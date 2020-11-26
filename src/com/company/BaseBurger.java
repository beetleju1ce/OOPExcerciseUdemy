package com.company;

/**
 * A class that represents basic hamburger
 */
public class BaseBurger {
    private String name;

    public String getBreadTypeRoll() {
        return breadTypeRoll;
    }

    public void setBreadTypeRoll(String breadTypeRoll) {
        this.breadTypeRoll = breadTypeRoll;
    }

    private String breadTypeRoll;
    private String meat;
    private double price;
    private String addition;
    private double additionPrice;
    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;

    /**
     * A constructor that initialize basic hamburger
     * @param name - sets the name of the base burger
     * @param breadTypeRoll - sets the breadroll type
     * @param meat - sets the type of meat
     * @param price - sets the price of the burger
     */
    public BaseBurger(String name, String breadTypeRoll, String meat, double price){
        this.name = name;
        this.breadTypeRoll = breadTypeRoll;
        this.meat = meat;
        this.price = price;
    }

    /**
     * A method that adds additions to the burger
     * @param name - addition's name
     * @param price - addition's price
     */
    public void addBurgerAddition(String name, double price){
        this.addition = name;
        this.additionPrice = price;
    }

    /**
     * A method that adds additions to the burger
     * @param name - addition's name
     * @param price - addition's price
     */
    public void addBurgerAddition1(String name, double price){
        this.addition1 = name;
        this.addition1Price = price;
    }

    /**
     * A method that adds additions to the burger
     * @param name - addition's name
     * @param price - addition's price
     */
    public void addBurgerAddition2(String name, double price){
        this.addition2 = name;
        this.addition2Price = price;
    }

    /**
     * A method that adds additions to the burger
     * @param name - addition's name
     * @param price - addition's price
     */
    public void addBurgerAddition3(String name, double price){
        this.addition3 = name;
        this.addition3Price = price;
    }

    /**
     * A method that calculates the burger price
     * @return - burger price
     */
    public double calculateBurgerPrice(){
        double burgerPrice = this.price;
        System.out.println("The price of " + this.name + " burger with " + this.breadTypeRoll + " bread roll is: " + this.price);
        if(addition != null){
            burgerPrice = burgerPrice + additionPrice;
            System.out.println("Added " + addition + " for " + burgerPrice);
        }
        if(addition1 != null){
            burgerPrice = burgerPrice + addition1Price;
            System.out.println("Added " + addition1 + " for " + burgerPrice);
        }
        if(addition2 != null){
            burgerPrice = burgerPrice + addition2Price;
            System.out.println("Added " + addition2 + " for " + burgerPrice);
        }
        if(addition3 != null){
            burgerPrice = burgerPrice + addition3Price;
            System.out.println("Added " + addition3 + " for " + burgerPrice);
        }
        return burgerPrice;
    }

}
