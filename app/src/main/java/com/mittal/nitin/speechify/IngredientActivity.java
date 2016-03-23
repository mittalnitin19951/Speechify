package com.mittal.nitin.speechify;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class IngredientActivity extends AppCompatActivity {

    private ArrayList<String> ingredients;
    private RecyclerView mRecyclerView;
    private IngridientsAdapter adapter;
    private List<FeedItem> feedsList;
    private TextView textView;
    private String recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient);
        ingredients=new ArrayList<>();
        feedsList = new ArrayList<>();


        Bundle extras=getIntent().getExtras();
        if(extras==null)
        {
            return;
        }
        ingredients=extras.getStringArrayList("ingredients");
        String[] a=new String[ingredients.size()];
        ingredients.toArray(a);

        recipe=extras.getString("recipe");
        textView=(TextView)findViewById(R.id.txtrecipe);
        textView.setText(recipe);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new IngridientsAdapter(IngredientActivity.this, feedsList);
        mRecyclerView.setAdapter(adapter);

        for(int i=0;i<ingredients.size();i++)
        {
            FeedItem feeditem = new FeedItem();
            feeditem.setIngredient(a[i]);
            feedsList.add(feeditem);

        }
    }

}
