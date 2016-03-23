package com.mittal.nitin.speechify;

import java.util.ArrayList;

/**
 * Created by HP on 24-03-2016.
 */
public class FeedItem {

    private String Receipe;
    private String Ingredient;
    private ArrayList<String> Ingredients;
    public String getReceipe() {
        return Receipe;
    }

    public void setReceipe(String receipe) {
        Receipe = receipe;
    }

    public ArrayList<String> getIngredients() {
        return Ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        Ingredients = ingredients;
    }


    public String getIngredient() {
        return Ingredient;
    }

    public void setIngredient(String ingredient) {
        Ingredient = ingredient;
    }
}
