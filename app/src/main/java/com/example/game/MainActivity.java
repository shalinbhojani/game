package com.example.game;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView leftDie = findViewById(R.id.computer_dice);
        final ImageView rightDie = findViewById(R.id.User_dice);
        Button upbutton = findViewById(R.id.upbutton);
        Button downbutton = findViewById(R.id.downbutton);
//-------------------------------------------------------------------
        final int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        upbutton.setOnClickListener((View.OnClickListener) v -> {
            Random rand = new Random();
            int computerdie = rand.nextInt(6);
            int userdie = rand.nextInt(6);
            Log.d("left die",String.valueOf(computerdie));
            Log.d("right die",String.valueOf(userdie));
            leftDie.setImageResource(diceArray[computerdie]);
            rightDie.setImageResource(diceArray[userdie]);

            if (computerdie < userdie) {
                TextView textView4 = (TextView) findViewById(R.id.textView4);
                textView4.setText("User Guessed right ! USER WON");

            }
            if(computerdie == userdie) {
                TextView textView4 = (TextView) findViewById(R.id.textView4);
                textView4.setText("IT'S A TIE");
            }
            if (computerdie > userdie){

                TextView textView4 = (TextView) findViewById(R.id.textView4);
                textView4.setText("SORRY ! COMPUTER WINS");
            }
        });
        downbutton.setOnClickListener((View.OnClickListener) v -> {
            Random rand = new Random();
            int computerdie = rand.nextInt(6);
            int userdie = rand.nextInt(6);
            Log.d("left die",String.valueOf(computerdie));
            Log.d("right die",String.valueOf(userdie));
            leftDie.setImageResource(diceArray[computerdie]);
            rightDie.setImageResource(diceArray[userdie]);

            if (computerdie > userdie) {
                TextView textView4 = (TextView) findViewById(R.id.textView4);
                textView4.setText("User Guessed right ! USER WON");
            }
            if(computerdie == userdie) {
                TextView textView4 = (TextView) findViewById(R.id.textView4);
                textView4.setText("IT'S A TIE");
            }
            if (computerdie < userdie){
                TextView textView4 = (TextView) findViewById(R.id.textView4);
                textView4.setText("SORRY ! COMPUTER WINS");
            }
        });
    }
}