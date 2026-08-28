package model;

public class Apple extends Food {
    private String colour;

    public Apple (int amount, float price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public float getDiscount() {
        if (colour == "red")
            return 60;

        return 0;
    }

}

