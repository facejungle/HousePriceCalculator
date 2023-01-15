package com.example.pricecalchouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    private EditText PriceOnMeter;
    private EditText WallHeight;
    private EditText WallAxisX;
    private EditText WallAxisY;
    private EditText NumWallAxisX;
    private EditText NumWallAxisY;
    private EditText NumGableAxisX;
    private EditText NumGableAxisY;

    private TextView SummaryPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateWallArea () {}

    public void calculatePrice(View view) {
        PriceOnMeter = findViewById(R.id.PriceMeter);
        SummaryPrice = findViewById(R.id.SummaryPrice);

        if(!PriceOnMeter.getText().toString().isEmpty() && PriceOnMeter.getText().toString() != null){
            SummaryPrice.setText(String.valueOf("Summary2"));
        } else {
            PriceOnMeter.setText("0");
            Toast.makeText(
                    MainActivity.this, "Price on meter is null!",
                    Toast.LENGTH_SHORT
            ).show();
        }


    }
}