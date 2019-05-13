package com.example.pizzeria;

public interface PizzaFactory
{

    default Pizza createPizzaVegetarian(Sizes size)
    {
        PizzaBuilder pizzaBuilder = new VegetarianBuilder();
        PizzaEngineer pizzaEngineer = new PizzaEngineer(pizzaBuilder);
        pizzaEngineer.makePizza(size);
        return pizzaEngineer.getPizza();
    }

    default Pizza createPizzaCapricciosa(Sizes size)
    {
        PizzaBuilder pizzaBuilder = new CapricciosaBuilder();
        PizzaEngineer pizzaEngineer = new PizzaEngineer(pizzaBuilder);
        pizzaEngineer.makePizza(size);
        return pizzaEngineer.getPizza();
    }

    default  Pizza createPizzaPepperoni(Sizes size)
    {
        PizzaBuilder pizzaBuilder = new PepperoniBuilder();
        PizzaEngineer pizzaEngineer = new PizzaEngineer(pizzaBuilder);
        pizzaEngineer.makePizza(size);
        return pizzaEngineer.getPizza();
    }

    String getRestaurantAddress();

}
