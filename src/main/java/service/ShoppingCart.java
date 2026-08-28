package service;
import model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart (Food[] products) {
        this.products = products;
    }
     public float getTotalPrice (){
        float total = 0;
        for (int i = 0; i < products.length; i++){
            float amount = products[i].getAmount();
            float price = products[i].getPrice();

            total += amount * price;
        }
            return total;
         }
         public  float getTotalPriceWithDiscount(){
        float total = 0;
        for (int i = 0; i < products.length; i++) {
            float amount = products[i].getAmount();
            float price = products[i].getPrice();
            float productPrice = amount * price;
            float discount = products[i].getDiscount();
            float discountAmount  = (productPrice * discount) / 100;
            float discountPrice = productPrice - discountAmount;
            total += discountPrice;
        }
            return total;

         }
         public float getTotalVegetarianPrice(){
             float total = 0;
            for (int i = 0; i < products.length; i++){
                float amount = products[i].getAmount();
                float price = products[i].getPrice();
                float productPrice = amount * price;

                if (products[i].getIsVegetarian()){
                    total += productPrice;
                }
                }
                    return total;
            }

         }

