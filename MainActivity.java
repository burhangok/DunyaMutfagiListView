package ismek.com.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    //Global Components
    public ListView foodListView;

    //Global Variables

    public List<Food> foodList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodListView = findViewById(R.id.list);


        foodList.add(new Food("PİZZA","İTALYA",R.drawable.arkaplan1));
        foodList.add(new Food("ÖZBEK PİLAVI","ÖZBEKİSTAN",R.drawable.arkaplan2));
        foodList.add(new Food("UKRAYNA MANTISI","UKRAYNA",R.drawable.arkaplan3));

        FoodAdapter aFood = new FoodAdapter(MainActivity.this,foodList);

        foodListView.setAdapter(aFood);


    }
}
