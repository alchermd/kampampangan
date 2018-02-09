package me.johnalcher.kapampangan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alchermd on 2/9/18.
 */

/**
 * A custom adapter for the Word class.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the next word.
        Word word = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Find and populate the views.
        TextView kapampanganTranslation = (TextView) convertView.findViewById(R.id.kapampangan_translation);
        TextView tagalogTranslation = (TextView) convertView.findViewById(R.id.tagalog_translation);
        TextView englishTranslation = (TextView) convertView.findViewById(R.id.english_translation);

        kapampanganTranslation.setText(word.getKapampanganTranslation());
        tagalogTranslation.setText(word.getTagalogTranslation());
        englishTranslation.setText(word.getEnglishTranslation());

        return convertView;
    }
}
