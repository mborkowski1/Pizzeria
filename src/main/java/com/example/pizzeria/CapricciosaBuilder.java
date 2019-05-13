package com.example.pizzeria;

public class CapricciosaBuilder implements PizzaBuilder
{

    private Pizza pizza;

    CapricciosaBuilder()
    {
        this.pizza = new Pizza();
    }

    @Override
    public void buildPizzaName()
    {
        pizza.setPizzaName("Capricciosa");
    }

    @Override
    public void buildPizzaPrice()
    {
        switch (pizza.getSize())
        {
            case SMALL:
                pizza.setPizzaPrice(22);
                break;
            case MEDIUM:
                pizza.setPizzaPrice(27);
                break;
            case BIG:
                pizza.setPizzaPrice(32);
        }
    }

    @Override
    public void buildPizzaIngredients()
    {
        pizza.setPizzaIngredients(Ingredients.MUSHROOMS, Ingredients.SAUCE, Ingredients.HAM);
    }

    @Override
    public void buildPizzaHotLevel()
    {
        pizza.setPizzaHotLevel(1);
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
