package com.commerce.inventory_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping("/{productId}")
    public InventoryResponse getInventory(@PathVariable Long productId) throws InterruptedException {
        InventoryResponse inventoryResponse = new InventoryResponse(productId,20);
//        Thread.sleep(5000);
        return inventoryResponse;
    }
}
