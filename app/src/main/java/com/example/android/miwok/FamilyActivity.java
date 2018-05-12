package com.example.android.miwok;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<word_format> words = new ArrayList<word_format> ();
        words.add(new word_format("әpә","father",R.mipmap.ic_launcher));
        words.add(new word_format("әṭa","mother",R.mipmap.ic_launcher));
        words.add(new word_format("angsi","son",R.mipmap.ic_launcher));
        words.add(new word_format("tune","daughter",R.mipmap.ic_launcher));
        words.add(new word_format("taachi","older brother",R.mipmap.ic_launcher));
        words.add(new word_format("chalitti","younger brother",R.mipmap.ic_launcher));
        words.add(new word_format("teṭe","older sister",R.mipmap.ic_launcher));
        words.add(new word_format("kolliti","younger sister",R.mipmap.ic_launcher));
        words.add(new word_format("ama","grandmother",R.mipmap.ic_launcher));
        words.add(new word_format("paapa","grandfather",R.mipmap.ic_launcher));

        //  ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        iWordAdapter adapter = new iWordAdapter(this,words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
