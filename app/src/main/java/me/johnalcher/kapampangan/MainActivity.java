package me.johnalcher.kapampangan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set phrasesButton to launch PhrasesActivity on click.
        Button phrasesButton = (Button) findViewById(R.id.phrases_button);
        phrasesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(getApplicationContext(), PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        // Set numbersButton to launch NumbersActivity on click.
        Button numbersButton = (Button) findViewById(R.id.numbers_button);
        numbersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(getApplicationContext(), NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Set colorsButton to launch ColorsActivity on click.
        Button colorsButton = (Button) findViewById(R.id.colors_button);
        colorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(getApplicationContext(), ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        // Set moreButton to launch MoreActivity on click.
        Button moreButton = (Button) findViewById(R.id.more_button);
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moreIntent = new Intent(getApplicationContext(), MoreActivity.class);
                startActivity(moreIntent);
            }
        });

    }
}
