package com.example.bruno.canyouguestit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randonNumber;

    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void guessFunction(View view){
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int number = Integer.parseInt(guessEditText.getText().toString());
            if (number > randonNumber) {
                makeToast("Lower");
            }
            if (number < randonNumber) {
                makeToast("Higher");

            }
            if (number == randonNumber) {
                makeToast("That's right!");
                makeToast("I'm thinking in a new one... Try again!");
                Random rand = new Random();
                randonNumber = rand.nextInt(50) + 1;

            }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randonNumber = rand.nextInt(50) + 1;
    }
}
