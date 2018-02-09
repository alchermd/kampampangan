package me.johnalcher.kapampangan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Populate an ArrayList with the custom Word class.
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Metung", "Isa", "One"));
        words.add(new Word("Adwa", "Dalawa", "Two"));
        words.add(new Word("Atlu", "Tatlo", "Three"));
        words.add(new Word("Apat", "Apat", "Four"));
        words.add(new Word("Lima", "Lima", "Five"));
        words.add(new Word("Anam", "Anim", "Six"));
        words.add(new Word("Pitu", "Pito", "Seven"));
        words.add(new Word("Walu", "Walo", "Eight"));
        words.add(new Word("Siyam", "Siyam", "Nine"));
        words.add(new Word("Apulu", "Sampu", "Ten"));

        // Use the custom adapter to store the words list.
        WordAdapter numbersAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(numbersAdapter);
    }
}
