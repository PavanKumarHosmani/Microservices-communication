package com.commerce.inventory_service;

public class InventoryResponse {
    private Long product_id;
    private int available_quantity;
    
    public InventoryResponse() {
    }

    public InventoryResponse(Long product_id, int available_quantity) {
        this.product_id = product_id;
        this.available_quantity = available_quantity;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }
    
    public void setAvailable_quantity(int available_quantity) {
        this.available_quantity = available_quantity;
    }

    public Long getProduct_id() {
        return product_id;
    }
    
    public int getAvailable_quantity() {
        return available_quantity;
    }
}
