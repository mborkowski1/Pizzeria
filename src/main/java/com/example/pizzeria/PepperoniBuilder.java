package com.example.pizzeria;

public class PepperoniBuilder implements PizzaBuilder
{

    private Pizza pizza;

    PepperoniBuilder()
    {
        this.pizza = new Pizza();
    }

    @Override
    public void buildPizzaName()
    {
        pizza.setPizzaName("Pepperoni");
    }

    @Override
    public void buildPizzaPrice()
    {
        switch (pizza.getSize())
        {
            case SMALL:
                pizza.setPizzaPrice(25);
                break;
            case MEDIUM:
                pizza.setPizzaPrice(30);
                break;
            case BIG:
                pizza.setPizzaPrice(35);
        }
    }

    @Override
    public void buildPizzaIngredients()
    {
        pizza.setPizzaIngredients(Ingredients.SALAMI, Ingredients.HOT_PEPPER, Ingredients.ONION, Ingredients.CHEESE);
    }

    @Override
    public void buildPizzaHotLevel()
    {
        pizza.setPizzaHotLevel(5);
    }

    @Override
    public void buildPizzaSize(Sizes size)
    {
        pizza.setPizzaSize(size);
    }

    @Override
    public Pizza getPizza()
    {
        return this.pizza;
    }

}
