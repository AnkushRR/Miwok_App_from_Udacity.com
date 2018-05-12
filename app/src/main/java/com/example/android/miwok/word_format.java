package com.example.android.miwok;

import android.media.Image;

public class word_format {
    private String miwok_word;
    private String english_word;
    private static int i;

    public word_format(String miwok_translation, String english_translation){
        miwok_word=miwok_translation;
        english_word=english_translation;
    }
    public word_format(String miwok_translation, String english_translation, int imageId){
        miwok_word=miwok_translation;
        english_word=english_translation;
        i=imageId;
    }

    public String getMiwok_word(){
        return miwok_word;
    }

    public String getEnglish_word(){
        return english_word;
    }

    public static int getImage(){ return i;}
}
