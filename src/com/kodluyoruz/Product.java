package com.kodluyoruz;

/**
 * Class representing a product to be purchased
 */

public class Product {

    // Name of the seller
    private final String seller;
    // Name of the product
    private final String name;
    // Price of the product
    private final double price;

    /**
     * DONE
     * Construct a new Product given the following parameters
     * @param seller
     * @param name
     * @param price
     */


    public Product(String seller, String name, double price) {
        this.seller = seller;
        this.name = name;
        this.price = price;
    }

    /**
     * DONE
     * Construct a new Product from a given product
     * @param original
     */
    public Product(Product original) {
        // Use the constructor implemented above
        this.seller = original.seller;
        this.price = original.price;
        this.name = original.name;
    }

    /**
     * DONE
     * Return the seller of this product
     * @return seller
     */
    public final String getSeller() {
        // code here
        return seller;
    }

    /**
     * DONE
     * Return the name of this product
     * @return name
     */
    public final String getName() {
        // code here
        return name;
    }

    /**
     * DONE I GUESS?
     * Return the price of this product
     * @param cart
     * @return price
     */
    public double getPrice(Cart cart) { // cart üzerinden ürünü sayıp ona göre fiyat vermemiz gerekiyor
        // code here
        return 0.0;
    }

    /**
     * Returns true if the price of this product
     * can be reduced
     * @return
     */
    public boolean canBeReduced() {
        //Nothing to do here
        return true;
    }

    /**
     * Return the name of the product
     */
    public String toString() {
        // code here
        return name;
    }
}
