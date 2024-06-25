package itemservice.controller;

import itemservice.entity.Item;
import itemservice.service.ItemService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item/${version}")
@AllArgsConstructor
@Slf4j
public class ItemController {

    private ItemService service;

    @GetMapping("/items")
    public ResponseEntity getAllItems() {
        List<Item> allItems = service.getAllItems();
        if (allItems.isEmpty()) {
            log.info("You have not yet defined any items for your item database.");
            return new ResponseEntity("No items were yet defined", HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(allItems);
    }

    @PostMapping("/items")
    public ResponseEntity addItem(@RequestBody Item item) {
        Item createdItem;
        try {
            createdItem = service.createItem(item);
        } catch (Exception e) {
            log.info("Could not create ite: " + item.toString());
            return ResponseEntity.badRequest().build();
        }
        return new ResponseEntity(createdItem, HttpStatus.CREATED);
    }

}
