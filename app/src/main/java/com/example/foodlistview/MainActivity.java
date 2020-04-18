package com.example.foodlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    private static final String TAG = "FoodListview";
    ListView lv_food;
    ArrayList<Food> listFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_food = (ListView) findViewById(R.id.lv_food);
        
        addData();
        CustomAdapter adapter = new CustomAdapter(this,R.layout.item_food,listFood);
        lv_food.setAdapter(adapter);
    }

    private void addData(){
        listFood  = new ArrayList<>();
        listFood.add(new Food("BiBimBub","100000 VND",R.drawable.bibibub));
        listFood.add(new Food("Mì ống","60000 VND",R.drawable.pasta));
        listFood.add(new Food("Rau trộn","50000 VND",R.drawable.salad));
        listFood.add(new Food("Bánh kem","240000 VND",R.drawable.cake));
        listFood.add(new Food("Hăm - bơ - gơ","60000 VND",R.drawable.harburger));
        listFood.add(new Food("Bánh mỳ trứng","50000 VND",R.drawable.breakfast));
        listFood.add(new Food("Cơm chiên","80000 VND",R.drawable.rice));
        listFood.add(new Food("Món khai vị","60000 VND",R.drawable.soap));
    }
}
