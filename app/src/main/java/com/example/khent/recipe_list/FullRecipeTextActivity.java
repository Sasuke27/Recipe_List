package com.example.khent.recipe_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FullRecipeTextActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_recipe_text);

        textView = (TextView)findViewById(R.id.textviewFullDesc);
        imageview = (ImageView)findViewById(R.id.imageView);

        Intent intent = getIntent();
        String result = intent.getExtras().getString("Send");


        if(result.equals("Artichoke Hummus")){
            textView.setText("1 can (15 oz.) chickpeas (garbanzo beans), rinsed.\n" +
                    "1 can (13.75 oz.) artichoke hearts, drained.\n" +
                    "1 pkg. ( 10 oz.) frozen chopped spinach, thawed, squeezed dry.\n" +
                    "1/3 cup tahini.\n" +
                    "1/4 cup olive oil.\n" +
                    "6 Tbsp. grated Parmesan cheese.\n" +
                    "3 Tbsp. lemon juice.\n" +
                    "2 cloves garlic.");
            imageview.setImageResource(R.drawable.chilledcantaloupecoup);


        } else if (result.equals("Baked White Bean Dip with Rosemary and Parmesan")){
            textView.setText("3/4 cup Olive Oil.\n" +
                    "2 Garlic Cloves, Peeled and minced.\n" +
                    "2 1/2 cups Cooked Cannellini Beans, drained and rinsed.\n" +
                    "1 tablespoon Fresh Rosemary, Chopped.\n" +
                    "1 tablespoon Lemon juice, Freshly squeezed.\n" +
                    "1/2 cup Parmigiano-Reggiano cheese, grated.\n" +
                    "Crostini.");
            imageview.setImageResource(R.drawable.download);


        } else if (result.equals("Black Bean Dip")){
            textView.setText("2 (15 oz) cans black beans, rinsed and drained.\n" +
                    "1/2 cup chopped yellow onion.\n" +
                    "1/3 cup chopped cilantro.\n" +
                    "1 clove garlic, minced.\n" +
                    "1 small jalapeño, seeds removed and diced.\n" +
                    "2 tablespoons fresh lime juice.\n" +
                    "1/4 teaspoon ground cumin.\n" +
                    "1/4 teaspoon chili powder.");

            imageview.setImageResource(R.drawable.easyblackbeandip);


        } else if (result.equals("Blood Orange and Green Olive Salad")){
            textView.setText("1 small red onion, very-thinly sliced into half moons.\n" +
                    "12 oil-cured black olives, pitted and halved.\n" +
                    "3 small blood oranges.\n" +
                    "1 medium tangerine.\n" +
                    "For the dressing:\n" +
                    "4 anchovy fillets, minced.\n" +
                    "2 tablespoons red or white wine vinegar.\n" +
                    "1/2 teaspoon red pepper flakes.");

            imageview.setImageResource(R.drawable.images);



        }else if (result.equals("Bruschetta Three Ways")){
            textView.setText("1 large baguette, or rustic Italian bread, sliced to ½-inch thick.\n" +
                    "¼ pound of Prosciutto di Parma, thinly sliced.\n" +
                    "1 package small cherry tomatoes.\n" +
                    "1 small cantaloupe melon.\n" +
                    "1 package of micro greens.\n" +
                    "8 oz. fontina cheese, thinly sliced.\n" +
                    "8 oz. soft gorgonzola cheese.\n" +
                    "10 fresh basil leaves, finely chopped.");

            imageview.setImageResource(R.drawable.img);


        }else if (result.equals("Chili Garlic Corn Chips")){
            textView.setText("Corn, Vegetable Oil (Corn, Canola, and/or Sunflower Oil), Salt, Sugar, \n" +
                    "Monosodium Glutamate, Fructose, Sodium Diacetate, Soy Sauce (Soybean, Wheat, Salt), \n" +
                    "Onion Powder, Maltodextrin (Made From Corn), Hydrolyzed Soy Protein, Hydrolyzed Corn Protein, \n" +
                    "Garlic Powder, Torula Yeast, Malic Acid, Extractives of Paprika, Spices, Caramel Color, \n" +
                    "Disodium Inosinate, Disodium Guanylate, Dextrose, and Natural Flavor");

            imageview.setImageResource(R.drawable.imgs);


        }else if (result.equals("Chilled Ginger Cantaloupe Soup")){
            textView.setText("1 medium cantaloupe, cut into chunks.\n" +
                    "½ cup 0% fat plain Greek yogurt.\n" +
                    "1 tbsp grated fresh ginger (do not omit)\n" +
                    "Juice from one lemon.\n" +
                    "1 or 2 pinches of sea salt.\n" +
                    "Dash of ground cinnamon or nutmeg.\n" +
                    "A few fresh basil or mint leaves, chopped.");

            imageview.setImageResource(R.drawable.tattooedmarthabruschettathreewaysheader);
        }


    }

}
