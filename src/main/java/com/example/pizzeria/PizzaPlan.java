package com.example.pizzeria;

public interface PizzaPlan
{

    void setPizzaName(String name);
    void setPizzaIngredients(Ingredients... ingredients);
    void setPizzaPrice(double price);
    void setPizzaHotLevel(int hotLevel);
    void setPizzaSize(Sizes size);

}
