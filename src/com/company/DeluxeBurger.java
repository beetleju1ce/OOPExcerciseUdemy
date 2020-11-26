package com.company;

/**
 * A class that represents the deluxe burger and extends
 * the basic burger class
 */
public class DeluxeBurger extends BaseBurger {

    /**
     * A constructor that initialize deluxe hamburger
     * @param breadRollType - set beard roll type
     * @param meat - sets meat type
     * @param softDrink - sets the soft drink type
     * @param frenchFries - sets the french fries type
     */
    public DeluxeBurger(String breadRollType, String meat,  SoftDrink softDrink, FrenchFries frenchFries) {
        super("Deluxe", breadRollType, meat, 12.50);
    }

    /**
     * method that overrides the base burger method for adding extras
     * @param name - addition's name
     * @param price - addition's price
     */
    @Override
    public void addBurgerAddition(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    /**
     * method that overrides the base burger method for adding extras
     * @param name - addition's name
     * @param price - addition's price
     */
    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    /**
     * method that overrides the base burger method for adding extras
     * @param name - addition's name
     * @param price - addition's price
     */
    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    /**
     * method that overrides the base burger method for adding extras
     * @param name - addition's name
     * @param price - addition's price
     */
    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

}
