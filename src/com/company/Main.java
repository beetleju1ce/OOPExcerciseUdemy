package com.company;

public class Main {

    public static void main(String[] args) {
	BaseBurger hamburger = new BaseBurger("Basic", "white", "bacon", 3.75);
	hamburger.addBurgerAddition("Olives", 0.99);
	hamburger.addBurgerAddition1("olives", 0.99);
	hamburger.calculateBurgerPrice();
	HealthyBurger healthyHamburger = new HealthyBurger ("bacon", 0.99);
	healthyHamburger.addBurgerAddition("cheese", 0.99);
	healthyHamburger.addHealthyAddition4("Mozzarella", 0.99);
	healthyHamburger.addHealthyAddition5("tomatoes", 0.99);
	healthyHamburger.calculateBurgerPrice();
    SoftDrink sparklingWater = new SoftDrink();
    FrenchFries friesWithHerbs = new FrenchFries();
	DeluxeBurger deluxeBurger = new DeluxeBurger("white", "bacon", sparklingWater, friesWithHerbs);
		deluxeBurger.addBurgerAddition1("cheese", 0.99);
    }
}
