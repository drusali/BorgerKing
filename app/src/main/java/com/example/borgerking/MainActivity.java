package com.example.borgerking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<Cart> List;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Button viewCart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List = new ArrayList<Cart>();
        recyclerView = findViewById(R.id.rv_main);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        FoodAdapter itemAdapter = new FoodAdapter();

        itemAdapter.setData(Database.getAllMenuItems());
        recyclerView.setAdapter(itemAdapter);

        viewCart = findViewById(R.id.Cart);
        viewCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCartDetailActivity(v);
            }
        });

    }

    public void openCartDetailActivity(View v) {
        Intent intent = new Intent(MainActivity.this, Cart.class);
        startActivity(intent);
    }

}



