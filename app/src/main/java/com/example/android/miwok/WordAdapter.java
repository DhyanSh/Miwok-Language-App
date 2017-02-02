package com.example.android.miwok;
import android.content.Context;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Dhyan on 2017-01-09.
 */

public class WordAdapter extends ArrayAdapter<Word>{
int colorID;
    LinearLayout LyL;
    public WordAdapter(Context context, ArrayList<Word> resource, int colorResourceID) {
        super(context,0,resource);
        colorID=colorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Word currentWord =  getItem(position);

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_spec, parent, false);
        }
        TextView miwTextView = (TextView) listItemView.findViewById(R.id.miwok_textView);
        miwTextView.setBackgroundResource(colorID);
        miwTextView.setText(currentWord.getMiwokWord());

        TextView engTextView = (TextView) listItemView.findViewById(R.id.english_textView);
        engTextView.setBackgroundResource(colorID);
        engTextView.setText(currentWord.getEngWord());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.images);
        if (currentWord.getImage()!=0){
            imageView.setImageResource(currentWord.getImage());
        }
        else{
        imageView.setVisibility(View.GONE);}
      return listItemView;
    }




}
