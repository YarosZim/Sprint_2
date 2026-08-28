package model;

public abstract class Food implements Discountable {
    protected int amount;
    protected float price;
    protected boolean isVegetarian;


    public Food(int amount, float price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount(){
        return amount;
    }
    public float getPrice(){
        return price;
    }
    public boolean getIsVegetarian(){
        return isVegetarian;
    }
    @Override
    public float getDiscount() {
        return 0;
    }
}
