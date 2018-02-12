package me.johnalcher.kapampangan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Kapampangan ka ba?", "Kapampangan ka ba?", "Are you a native of Pampanga?"));
        words.add(new Word("Nanu ing lagyu mu?", "Anong pangalan mo?", "What is your name?"));
        words.add(new Word("John ya ing lagyu ku.", "John ang pangalan ko.", "John is my name."));
        words.add(new Word("Nokarin na ka?", "Nasaan ka?", "Where are you?"));
        words.add(new Word("Atyu ku keni.", "Nandito ako.", "I'm here."));
        words.add(new Word("Mimwa ku keka.", "Galit ako sa'yo.", "I'm angry at you."));
        words.add(new Word("Kaluguran daka.", "Mahal kita.", "I love you."));

        // Use the custom adapter to store the words list.
        WordAdapter numbersAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(numbersAdapter);
    }
}
