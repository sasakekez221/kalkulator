package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private double broj1, broj2;
    private EditText editTextBroj1, editTextBroj2;
    private TextView textViewRezultat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBroj1 = findViewById(R.id.editTextBroj1);
        editTextBroj2 = findViewById(R.id.editTextBroj2);
        textViewRezultat = findViewById(R.id.textViewRezultat);
    }
    public void takeNumbersFromEditTextAndPutIntoVariables(){
        broj1= Double.parseDouble(editTextBroj1.getText().toString());
        broj2= Double.parseDouble(editTextBroj2.getText().toString());
    }
    public void clickButtonZbroj(View view){
        takeNumbersFromEditTextAndPutIntoVariables();
        double rezultat = broj1 + broj2;
        textViewRezultat.setText(Double.toString(rezultat));
    }
    public void clickButtonOduzimanje(View view){
        takeNumbersFromEditTextAndPutIntoVariables();
        double rezultat = broj1 - broj2;
        textViewRezultat.setText(Double.toString(rezultat));
    }
    public void clickButtonMnozenje(View view){
        takeNumbersFromEditTextAndPutIntoVariables();
        double rezultat = broj1 * broj2;
        textViewRezultat.setText(Double.toString(rezultat));
    }
    public void clickButtonDjeljenje(View view){
        takeNumbersFromEditTextAndPutIntoVariables();
        double rezultat = broj1 / broj2;
        textViewRezultat.setText(Double.toString(rezultat));
    }
}