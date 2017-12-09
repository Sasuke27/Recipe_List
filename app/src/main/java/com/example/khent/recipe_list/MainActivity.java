package com.example.khent.recipe_list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    LinearLayoutManager layoutManager;
    ArrayList<Items> items;
    ItemAdapter itemAdapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        functions();

    }



    public void functions(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        items = RecipeDetails.getList();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        itemAdapter = new ItemAdapter(MainActivity.this,items);
        recyclerView.setAdapter(itemAdapter);
    }


}
