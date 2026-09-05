package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, float price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public float getDiscount() {
        if (Colour.RED.equals(colour)) {
            return Discount.APPLE_RED_DISCOUNT;
        }

        return 0;
    }
}