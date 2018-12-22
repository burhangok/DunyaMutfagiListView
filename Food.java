package ismek.com.customlistview;

import java.io.Serializable;

public class Food implements Serializable {

    private String foodName;
    private String countryName;
    private int background;

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public Food() {

    }



    public Food(String foodName, String countryName, int background) {
        this.foodName = foodName;
        this.countryName = countryName;
        this.background=background;
    }

    public String getFoodName() {

        return foodName;

    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
