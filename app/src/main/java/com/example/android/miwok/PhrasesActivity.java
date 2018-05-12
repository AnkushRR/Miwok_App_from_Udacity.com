package com.example.android.miwok;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        ArrayList<word_format> words = new ArrayList<word_format>();
        words.add(new word_format("minto wuksus", "Where are you going?"));
        words.add(new word_format("tinnә oyaase'nә", "What is your name?"));
        words.add(new word_format("oyaaset", "My name is..."));
        words.add(new word_format("michәksәs?", "How are you feeling?"));
        words.add(new word_format("kuchi achit", "I’m feeling good."));
        words.add(new word_format("әәnәs'aa?", "Are you coming?"));
        words.add(new word_format("hәә’ әәnәm", "Yes, I’m coming"));
        words.add(new word_format("әәnәm", "I’m coming."));
        words.add(new word_format("yoowutis", "Let’s go."));
        words.add(new word_format("әnni'nem", "Come here."));

        //  ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}
