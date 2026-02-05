package com.example.demo.service;

import com.example.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();

    public Item addItem(Item item) {
        items.add(item);
        return item;
    }

    public Item getItemById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Item> getAllItems() {
        return items;
    }
}
