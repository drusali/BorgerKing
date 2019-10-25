package com.example.borgerking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Database {
    public static Food getMenuItemsById(int itemID) {
        return menuItems.get(itemID);
    }



    public static ArrayList<Food> getAllMenuItems() {
        return new ArrayList<Food>((List) Arrays.asList(menuItems.values().toArray()));
    }

    private static final HashMap<Integer, Food> menuItems = new HashMap<>();

    static {
        menuItems.put(1, new Food(
                1,
                "Borger King Whooper",
                "8",
                "The classic hunger-tamer, smoked beef coupled with toasted buns and cheese",
                R.drawable.burger

        ));
        menuItems.put(2, new Food(
                2,
                "Sothern Carlinfornia Chicken Burger",
                "7",
                "Thick cut chicken breast deep fried and topped with smoky mediterrain sauce served in a burger",
                R.drawable.chicken_burger
        ));

        menuItems.put(3, new Food(
                3,
                "Coca-Cola",
                "3",
                "Fresh drink of Coke",
                R.drawable.coke

        ));

        menuItems.put(4, new Food(
                4,
                "Curry",
                "12",
                " Traditional herbs and spices blended in with chili and chicken",
                R.drawable.curry

        ));
        menuItems.put(5, new Food(
                5,
                "Fish and Chips",
                "8",
                "Want something new? Try our new fish and chips range!",
                R.drawable.fnc

        ));
        menuItems.put(6, new Food(
                6,
                "Pancake",
                "6",
                "Get our your sweet tooth! Freshly made pancakes drizzeled with fresh honey and cherries",
                R.drawable.pancake

        ));
        menuItems.put(7, new Food(
                7,
                "Fries",
                "5",
                "Beer batter fries deep fried with beef fat. The crunch to get your day going",
                R.drawable.fries

                ));
        menuItems.put(8, new Food(
                8,
                "Kbbq",
                "13",
                "Find your Seoul food and try our KBBQ to go! Cooked meats served in a cup topped with korean sauce",
                R.drawable.kbbq
                ));
        menuItems.put(9, new Food(
                9,
                "Taco",
                "6",
                "Viva mexico! Burger and fries combined? Well here it is! The all new Taco range!",
                R.drawable.taco

        ));
        menuItems.put(10, new Food(
                10,
                "Ice Cream",
                "3",
                "Home-made vanilla ice cream served with a drizzle of chocolate sauce",
                R.drawable.icecream

        ));
        menuItems.put(11, new Food(
                11,
                "Kebab",
                "8",
                "The blast from the east. The kebab is filled with lamb cutlets and poured with fresh garlic sauce",
                R.drawable.kebab

        ));
        menuItems.put(12, new Food(
                12,
                "Onion Rings",
                "5",
                "Crispy onion rings, battered and deep fried ",
                R.drawable.onion_ring

        ));
        menuItems.put(13, new Food(
                13,
                "Laksa",
                "12",
                "Try our new soup selection with our homemade laksa for this year's south east asian theme",
                R.drawable.laksa

        ));
        menuItems.put(14, new Food(
                14,
                "Ramen",
                "8",
                "Part of our Asian theme, come try out ramen range! Topped with Chasyu and fresh noodles",
                R.drawable.ramen
                        ));

        menuItems.put(15, new Food(
                15,
                "Fried Chicken",
                "12",
                "12 pieces of succulant Southern Style Fried Chicken sprinkled with our secret herbs and spices",
                R.drawable.fried_chicken

                ));

    }
}

