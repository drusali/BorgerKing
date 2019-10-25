package com.example.borgerking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class FoodDetailActivity extends AppCompatActivity {
    private TextView name;
    private TextView desc;
    private ImageView image;
    private TextView price;
    private TextView quantity;
    private Button increase;
    private Button decrease;
    int number = 1;
    private Button addToOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fooddetail);


        Intent intent = getIntent();


        int itemID = intent.getIntExtra("ItemID", 0);

        Food menuItems = Database.getMenuItemsById(itemID);


        name = findViewById(R.id.foodname);
        desc = findViewById(R.id.fooddesc);
        image = findViewById(R.id.image);
        price = findViewById(R.id.price);
        increase = findViewById(R.id.add);
        decrease = findViewById(R.id.minus);
        quantity = findViewById(R.id.quantity);
        addToOrder = findViewById(R.id.addOrder);


        quantity.setText("" + number);
        name.setText(menuItems.getFoodname());
        desc.setText(menuItems.getDesc());
        price.setText(menuItems.getPrice());
        image.setImageResource(menuItems.getImageDrawableId());


        addToOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToCart();
                Toast.makeText(getApplicationContext(),"Added to cart. Please return home",Toast.LENGTH_LONG).show();
            }
        });

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseNumber();
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseNumber();
            }
        });
    }

    public void increaseNumber() {
        number = number + 1;
        display(number);
    }

    public void decreaseNumber() {
        number = number - 1;
        display(number);
    }

    public void display(int number) {
        TextView displayInteger = findViewById(R.id.quantity);
        displayInteger.setText("" + number);

    }

    public void addToCart() {

        String foodName = (String) name.getText();
        String foodPrice = (String) desc.getText();
        int price = Integer.parseInt(foodPrice);
        int total = price * number;


        MainActivity.List.add(new Cart(foodName, price, number, total));

        for (int i = 0; i < MainActivity.List.size(); i++) {
            System.out.println(MainActivity.List.get(i));
        }
        System.out.println(total);

    }


}


