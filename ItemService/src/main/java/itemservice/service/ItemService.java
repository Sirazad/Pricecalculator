package itemservice.service;

import itemservice.entity.Item;
import itemservice.repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ItemService {

    private ItemRepository repository;

    public List<Item> getAllItems() {
        return repository.findAll();
    }

    public Item createItem(Item item) {
//        validate(item);
        return repository.save(item);
    }
}
