package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<word_format> words = new ArrayList<word_format> ();
        words.add(new word_format("wetetti","red",R.mipmap.ic_launcher));
        words.add(new word_format("chokokki","green",R.mipmap.ic_launcher));
        words.add(new word_format("takaaki","brown",R.mipmap.ic_launcher));
        words.add(new word_format("ṭopoppi","gray",R.mipmap.ic_launcher));
        words.add(new word_format("kululli","black",R.mipmap.ic_launcher));
        words.add(new word_format("kelelli","white",R.mipmap.ic_launcher));
        words.add(new word_format("ṭopiisә","dusty yellow",R.mipmap.ic_launcher));
        words.add(new word_format("chiwiiṭә","mustard yellow",R.mipmap.ic_launcher));

        //  ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        iWordAdapter adapter = new iWordAdapter(this,words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
