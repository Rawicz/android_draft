package com.example.draft;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
   }

   @SuppressLint("SetTextI18n")
   public void checkParity(View view) {
      try {
         String number = ((TextView) findViewById(R.id.input)).getText().toString();
         String output = "Odd!";
         if (Integer.parseInt(number) % 2 == 0)
            output = "Even!";
         ((TextView) findViewById(R.id.textView)).setText(output);
      } catch(NumberFormatException e) {
         ((TextView) findViewById(R.id.textView)).setText("Enter correct number!");
      }
   }
}
