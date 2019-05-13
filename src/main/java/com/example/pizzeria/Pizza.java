package com.example.pizzeria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza implements PizzaPlan
{

    private String name;
    private int hotLevel;
    private double price;
    private List<Ingredients> ingredients = new ArrayList<>();
    private Sizes size;

    public void setPizzaName(String name)
    {
        this.name = name;
    }

    public void setPizzaIngredients(Ingredients... ingredients)
    {
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    public void setPizzaSize(Sizes size) { this.size = size; }

    public void setPizzaPrice(double price)
    {
        this.price = price;
    }

    public void setPizzaHotLevel(int hotLevel)
    {
        this.hotLevel = hotLevel;

    }

    double getPrice() {
        return price;
    }

    Sizes getSize() { return size; }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        result.append("Name: ").append(this.name).append("\n");
        result.append("Hot level: ").append(this.hotLevel).append("\n");
        result.append("Ingredients: ").append("\n");
        for (Ingredients i : ingredients)
        {
            result.append(i.name().toLowerCase().replace("_", " ")).append("\n");
        }
        result.append("Size: ").append(this.size.name().toLowerCase()).append("\n");
        result.append("Price: ").append(this.price).append("\n");
        return result.toString();
    }

}
