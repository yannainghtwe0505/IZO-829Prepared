package Classes;

import java.util.ArrayList;
import java.util.List;

public final class immutableTest { // An immutable object declaration
    private final List<String> favoriteFoods;

    public immutableTest() {
        this.favoriteFoods= new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index) {
        return favoriteFoods.get(index);
    }
}