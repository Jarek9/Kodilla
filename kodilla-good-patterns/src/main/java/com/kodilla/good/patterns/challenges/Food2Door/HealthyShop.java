package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Supplier{

    private String supplierName;
    private String productName;
    private int quantity;

    public HealthyShop(String supplierName, String productName, int quantity) {
        this.supplierName = supplierName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop{" +
                "supplierName='" + supplierName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean process() {
        return false;
    }
}
