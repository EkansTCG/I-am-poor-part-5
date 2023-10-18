/**
 * NAME:Evan Li
 * DATE:10/18/23
 * ASSIGNMENT: I AM POOR PART 5
 */
package com.example.iampoorpart5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;//creates button
    Button button1;//creates button1
    TextView text;//creates text

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);// assigns button a value
        button1 = (Button) findViewById(R.id.button2);// assigns button1 a value
        text = findViewById(R.id.textView);// assigns text a value
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                verifyRichness(button);// calls the method verify richness on button
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                verifyRichness(button1);// calls the method verify richness on button1
            }
        });// test
    }

    public void verifyRichness(Button button1) {
        if(button1.getText().toString().equals("I AM POOR")) {
            text.setText("I AM POOR");//sets text to "I AM POOR"
        }
        else if(button1.getText().toString().equals("I AM RICH")) {
            text.setText("I AM RICH");//sets text to "I AM RICH"
        }
    }
}