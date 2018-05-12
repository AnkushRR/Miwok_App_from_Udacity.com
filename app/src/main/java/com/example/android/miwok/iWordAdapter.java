package com.example.android.miwok;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class iWordAdapter extends ArrayAdapter<word_format>{


    public iWordAdapter(@NonNull Context context, ArrayList<word_format> objects) {
        super(context, 0, objects);
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_with_image, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        word_format currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwok_word = listItemView.findViewById(R.id.miwok_word);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        if (currentWord != null) {
            miwok_word.setText(currentWord.getMiwok_word());
        }

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView english_word = listItemView.findViewById(R.id.english_word);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        if (currentWord != null) {
            english_word.setText(currentWord.getEnglish_word());
        }

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = listItemView.findViewById(R.id.list_image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
          iconView.setImageResource(word_format.getImage());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
