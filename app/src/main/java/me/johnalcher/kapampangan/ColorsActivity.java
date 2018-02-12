package me.johnalcher.kapampangan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Populate an ArrayList with the custom Word class.
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Matuling", "Itim", "Black"));
        words.add(new Word("Berdi", "Luntian", "Green"));
        words.add(new Word("Malutu", "Pula", "Red"));
        words.add(new Word("Dilo", "Dilaw", "Yellow"));
        words.add(new Word("Rosas", "Rosas", "Pink"));
        words.add(new Word("Maputi", "Puti", "White"));
        words.add(new Word("Iru", "Asul", "Blue"));

        // Use the custom adapter to store the words list.
        WordAdapter numbersAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(numbersAdapter);
    }
}
