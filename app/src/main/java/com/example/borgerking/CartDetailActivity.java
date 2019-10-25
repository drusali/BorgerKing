package com.example.borgerking;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CartDetailActivity extends AppCompatActivity {

    public TextView name;
    public TextView details;
    public String price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_activity);
        name = findViewById(R.id.textView);
        details = findViewById(R.id.price);
        price = String.valueOf(Cart.total());

        details.setText("Total Price: $" + price);

        Intent intent = getIntent();

        for (int i=0; i < MainActivity.List.size(); i++) {
            name.setText(name.getText() + " " + MainActivity.List.get(i) + " , "); }

    }

}