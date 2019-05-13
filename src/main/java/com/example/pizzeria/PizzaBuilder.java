package com.example.pizzeria;

public interface PizzaBuilder
{

    void buildPizzaName();
    void buildPizzaPrice();
    void buildPizzaIngredients();
    void buildPizzaHotLevel();
    void buildPizzaSize(Sizes size);

    Pizza getPizza();

}
