package com.example.khent.recipe_list;

import java.util.ArrayList;

/**
 * Created by khent on 12/8/2017.
 */

public class RecipeDetails {

    public static ArrayList<Items> getList(){
        ArrayList<Items> itemsList = new ArrayList<>();
        itemsList.add(
                new Items(
                        "Artichoke Hummus","1 can (15 oz.) chickpeas (garbanzo beans), rinsed.\n" +
                        "1 can (13.75 oz.) artichoke hearts, drained.\n" +
                        "1 pkg. ( 10 oz.) frozen chopped spinach, thawed, squeezed dry..."));
        itemsList.add(
                new Items(
                        "Baked White Bean Dip with Rosemary and Parmesan","3/4 cup Olive Oil.\n" +
                        "2 Garlic Cloves, Peeled and minced.\n" +
                        "2 1/2 cups Cooked Cannellini Beans, drained and rinsed.\n" +
                        "1 tablespoon Fresh Rosemary, Chopped..."));
        itemsList.add(
                new Items(
                        "Black Bean Dip","2 (15 oz) cans black beans, rinsed and drained.\n" +
                        "1/2 cup chopped yellow onion.\n" +
                        "1/3 cup chopped cilantro..."));
        itemsList.add(
                new Items(
                        "Blood Orange and Green Olive Salad","1 small red onion, very-thinly sliced into half moons.\n" +
                        "12 oil-cured black olives, pitted and halved.\n" +
                        "3 small blood oranges..."));
        itemsList.add(
                new Items(
                        "Bruschetta Three Ways","1 large baguette, or rustic Italian bread, sliced to ½-inch thick.\n" +
                        "¼ pound of Prosciutto di Parma, thinly sliced.\n" +
                        "1 package small cherry tomatoes..."));
        itemsList.add(
                new Items(
                        "Chili Garlic Corn Chips","Corn, Vegetable Oil (Corn, Canola, and/or Sunflower Oil), Salt, Sugar, \n" +
                        "Monosodium Glutamate, Fructose, Sodium Diacetate, Soy Sauce (Soybean, Wheat, Salt),..."));
        itemsList.add(
                new Items(
                        "Chilled Ginger Cantaloupe Soup","1 medium cantaloupe, cut into chunks.\n" +
                        "½ cup 0% fat plain Greek yogurt.\n" +
                        "1 tbsp grated fresh ginger (do not omit)..."));

        return itemsList;
    }


}
