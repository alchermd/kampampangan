package me.johnalcher.kapampangan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Populate an ArrayList with the custom Word class.
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Lagyu", "Pangalan", "Name"));
        words.add(new Word("Malagu", "Maganda", "Beautiful"));
        words.add(new Word("Masanting", "Guwapo", "Handsome"));
        words.add(new Word("Matsura", "Pangit", "Ugly"));
        words.add(new Word("Mapali", "Mainit", "Hot"));
        words.add(new Word("Marimla", "Malamig", "Cold"));
        words.add(new Word("Ua", "Oo", "Yes"));
        words.add(new Word("Ali", "Hindi", "No"));
        words.add(new Word("Maslam", "Maasim", "Sour"));
        words.add(new Word("Mayumu", "Matamis", "Sweet"));

        // Use the custom adapter to store the words list.
        WordAdapter numbersAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(numbersAdapter);
    }
}
