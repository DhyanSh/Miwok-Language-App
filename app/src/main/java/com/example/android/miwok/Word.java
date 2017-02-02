package com.example.android.miwok;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Dhyan on 2017-01-09.
 */

class Word {
    private String miwokWord,engWord;
    private int image,sound;

    Word(String engWord, String miwokWord, int image, int sound){

        this.miwokWord=miwokWord;
        this.engWord=engWord;
        this.image=image;
        this.sound=sound;
    }

    Word(String miwokWord, String engWord, int spund){

        this.miwokWord=miwokWord;
        this.engWord=engWord;
        this.sound=spund;

    }

    String getEngWord() {
        return engWord;
    }

    String getMiwokWord() {
        return miwokWord;
    }

    int getImage() {
        return image;
    }

    int getSound() {
        return sound;
    }

}
