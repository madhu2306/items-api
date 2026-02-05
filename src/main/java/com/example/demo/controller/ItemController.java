package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public Item addItem(@Valid @RequestBody Item item) {
        return itemService.addItem(item);
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
}
