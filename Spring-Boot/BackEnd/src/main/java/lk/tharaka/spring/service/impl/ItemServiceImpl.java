package lk.tharaka.spring.service.impl;

import lk.tharaka.spring.dto.ItemDTO;
import lk.tharaka.spring.entity.Item;
import lk.tharaka.spring.repository.ItemRepository;
import lk.tharaka.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository repository;

    @Override
    public boolean save(ItemDTO itemDTO) {

        Item item = new Item(
                itemDTO.getiName(),
                itemDTO.getiDiscription(),
                itemDTO.getQty(),
                itemDTO.getUnitPrice());

        repository.save(item);

        return true;
    }

    @Override
    public boolean delete(int code) {

        repository.deleteById(code);

        return true;
    }

    @Override
    public ItemDTO getItem(int code) {

        Item item = repository.findById(code).get();

        ItemDTO itemDTO = new ItemDTO(item.getCode(),
                item.getiName(),
                item.getiDiscription(),
                item.getQty(),
                item.getUnitPrice());

        return  itemDTO;
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() {

        List<Item>itemList = repository.findAll();

        ArrayList<ItemDTO>itemDTOArrayList = new ArrayList<>();

        for (Item item :itemList){
            ItemDTO itemDTO = new ItemDTO(
                    item.getCode(),
                    item.getiName(),
                    item.getiDiscription(),
                    item.getQty(),
                    item.getUnitPrice()
            );

            itemDTOArrayList.add(itemDTO);
        }
        return itemDTOArrayList;
    }
}
