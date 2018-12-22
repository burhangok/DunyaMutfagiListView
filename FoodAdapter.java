package ismek.com.customlistview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class FoodAdapter extends BaseAdapter {

    List<Food> afoodList;
    LayoutInflater alayoutInflater;

    public FoodAdapter(Activity activity, List<Food> afoodList) {
        this.alayoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.afoodList = afoodList;
    }

    @Override
    public int getCount() {
        return afoodList.size();
    }

    @Override
    public Object getItem(int position) {
        return afoodList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView;

        rowView = alayoutInflater.inflate(R.layout.row_layout,null);

        TextView rFood = rowView.findViewById(R.id.foodName);
        TextView rCountry =rowView.findViewById(R.id.countryName);
        RelativeLayout rLayout= rowView.findViewById(R.id.rowLayout);



        Food foodTmp = afoodList.get(position);

        rFood.setText(foodTmp.getFoodName());
        rCountry.setText(foodTmp.getCountryName());

        rLayout.setBackgroundResource(foodTmp.getBackground());


        return rowView;
    }
}
